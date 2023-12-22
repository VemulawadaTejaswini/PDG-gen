import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
public class Main {

     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        long a=sc.nextLong();
         long b=sc.nextLong();
         long c=sc.nextLong();
         long d=sc.nextLong();
        long ans1=a*c;
        long ans2=a*d;
        long ans3=b*c;
        long ans4=b*d;
        long ans=Math.max(ans1,Math.max(ans2,Math.max(ans3,ans4)));
         System.out.println(ans);






     }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }
    static void sortReverse(long[] a) {
        ArrayList<Long> l=new ArrayList<>();
        for (long i:a) l.add(i);
//        Collections.sort.(l);
        Collections.sort(l,Collections.reverseOrder());
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long[] readArrayLong(long n) {
            long[] a=new long[(int)n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}