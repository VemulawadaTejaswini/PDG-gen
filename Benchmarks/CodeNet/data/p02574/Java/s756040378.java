import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        Utility.FastReader fr = new Utility.FastReader();
        Solver solver = new Solver(fr);
        int t = 1;
        while (t-- > 0) {
            solver.solve();
        }
        long timeEnd = System.nanoTime();
//        System.out.println("Completed in :" + ((double) (timeEnd - timeStart) / 1000000) + " miliseconds");
    }

    static class Solver {
        Utility.FastReader fr;
        static int MAX=(int)1e6+10;
        static boolean[] isUsedFactor=new boolean[MAX];
        static int[] spf=new int[MAX];
        static boolean bad=false;

        public Solver(Utility.FastReader fr) {
            this.fr = fr;
        }

        void sieve(){
            for(int i=1; i<MAX; ++i) spf[i]=i;
            for(long i=2; i*i<MAX; ++i){
                if(spf[(int)i]==i){
                    for(long j=i*i; j<MAX; j+=i){
                        if(spf[(int)j]==j) spf[(int)j]=(int)i;
                    }
                }
            }
        }

        void factorize(int num){
            if(bad) return;
            while(num!=1){
                int p=spf[num];
                if(isUsedFactor[p]){
                    bad=true;
                    return;
                }
                else{
                    isUsedFactor[p]=true;
                    while(num!=1 && num%p==0){
                        num/=p;
                    }
                }
            }
        }

        void solve() {
            sieve();
            int n=fr.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; ++i) arr[i]=fr.nextInt();
            for(int i=0; i<n; ++i){
                factorize(arr[i]);
            }
            if(!bad){
                System.out.println("pairwise coprime");
            }
            else{
                int g=arr[0];
                for(int i=1; i<n; ++i) g=Utility.gcd(g, arr[i]);
                if(g==1){
                    System.out.println("setwise coprime");
                }
                else{
                    System.out.println("not coprime");
                }
            }

        }
    }

    static class Utility {
        static void sort(int[] a) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            Collections.sort(list);
            for (int i = 0; i < a.length; i++) a[i] = list.get(i);
        }

        static void shuffleArray(long[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                long tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static void shuffleArray(int[] arr) {
            int n = arr.length;
            Random rnd = new Random();
            for (int i = 0; i < n; ++i) {
                int tmp = arr[i];
                int randomPos = i + rnd.nextInt(n - i);
                arr[i] = arr[randomPos];
                arr[randomPos] = tmp;
            }
        }

        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(new
                        InputStreamReader(System.in));
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }
    }
}

