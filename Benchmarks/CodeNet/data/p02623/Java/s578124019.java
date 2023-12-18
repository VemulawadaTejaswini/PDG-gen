import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, M, K; {int[] a = in.ii(); N = a[0]; M = a[1]; K = a[2];}
        int[] A = in.ii();
        int[] B = in.ii();
        int[] c = new int[N + M];
        for (int i = 0, j = 0, k = 0; ; ) {
            if (A[i] < B[j]) {
                c[k++] = A[i++];
                if (i == N) {
                    while (k < c.length) {
                        c[k++] = B[j++];
                    }
                    break;
                } 
            }
            else {
                c[k++] = B[j++];
                if (j == M) {
                    while (k < c.length) {
                        c[k++] = A[i++];
                    }
                    break;
                }
            }
        }
        int ans = 0;
        long t = 0;
        for (int k = 0; k < c.length; k++) {
            if (c[k] + t <= K) {
                t += c[k];
                ans += 1;
            } else {
                break;
            }
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
