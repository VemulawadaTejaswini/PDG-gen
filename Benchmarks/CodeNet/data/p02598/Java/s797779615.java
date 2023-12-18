import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/*
1
4
0011
 */
public class Main{

    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=1;//fs.nextInt();
        PrintWriter out=new PrintWriter(System.out);
        for (int tt=0; tt<T; tt++) {
            //solve
            int n= fs.nextInt();
            int k=fs.nextInt();
            int [] a=fs.nextArray(n);
            int min=1,max=(int)1e9+7;
            while(min!=max){
                int mid=(min+max)/2;
               if( ispossible(mid,k,a)){
                    max=mid;
               }
               else{
                   min=mid+1;
               }
            }
            System.out.println(min);


        }

    }
    public static boolean ispossible(int sol,int k,int[] a){

        for(int log:a){
            if(log<=sol){continue;}
            k-=(int)Math.ceil(log/sol);
            }
        return k>=0;
    }

    static final Random random=new Random();

    static void ruffleSort(int[] a) {
        int n=a.length;//shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
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
        int[] nextArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }


}