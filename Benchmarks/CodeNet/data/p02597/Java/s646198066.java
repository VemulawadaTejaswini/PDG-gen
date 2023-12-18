import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/*
1
4
0011
 */
public class Main {

    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=1;//fs.nextInt();
//        PrintWriter out=new PrintWriter(System.out);
        for (int tt=0; tt<T; tt++) {
            //solve
            int n=fs.nextInt();
            char[] a=fs.next().toCharArray();
            ArrayList<Integer>ws=new ArrayList<>(),
                    rs=new ArrayList<>();
            for(int i=0;i<a.length;i++){
                if(a[i]=='W'){
                    ws.add(i);
                }
                else{
                    rs.add(i);
                }
            }
            int wInd=0,rInd=rs.size()-1;
            int count=0;
            while( wInd<ws.size()&& rInd>=0 && ws.get(wInd)<rs.get(rInd)){
                count++;
                wInd++;
                rInd--;
            }
            System.out.println(count);
        }

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