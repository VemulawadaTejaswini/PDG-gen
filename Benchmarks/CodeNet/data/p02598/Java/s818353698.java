import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static FastScanner sc = new FastScanner();
    public static void main(String[] args) {
        int n=sc.nextInt();
        int k=sc.nextInt();
         int a[]=sc.readArray(n);
         int min=1,max=(int)1e9+100;
         while (min!=max){
             int mid=(min+max)/2;
             if (possible(mid,a,k)){
                 max=mid;

             }
             else{
                 mid=mid+1;
             }




        }
        System.out.println(min);
    }
    static boolean possible(int ans,int a[],int k){
        for (int i:a){
            if (i<=ans)continue;
            k-=(i+ans-1)/ans-1;
        }
        return k>=0;

    }

        static void sortint(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sort(long[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (long i : a) l.add((int) i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
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
    }
}



