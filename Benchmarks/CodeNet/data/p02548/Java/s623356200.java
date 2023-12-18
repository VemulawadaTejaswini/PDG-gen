import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main{
    private static FastScanner fs = new FastScanner();
    public static void main(String[] args) {
        Set<Tuple> set = new HashSet<>();
        int n = fs.nextInt();
        int res =(n-1);
        int temp = n;
        int b =2;
        while(b<n)
        {
            if(n%b==0)
            {
                res +=((n/b)-1);
            }
            else
            {
                res +=(n/b);
            }
            b++;
        }
//        System.out.println(b);
        System.out.println(res );




    }
    static class Tuple
    {
        int a;
        int b;
        int c;

        public Tuple(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        int  gcd(int a,int b)
        {
            while (b > 0)
            {
                int  temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        private int upper(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low+1)/2;
                if(arr[mid] <= key){
                    low = mid;
                }
                else{
                    high = mid-1;
                }
            }
            return low;
        }
        public int lower(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low)/2;
                if(arr[mid] >= key){
                    high = mid;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
        }
    }
}