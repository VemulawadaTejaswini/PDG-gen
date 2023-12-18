import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int n = in.i();
        int[] a = new int[n];

        for (int x = 1; ; x++) {
            int k = g(x, x, x);
            if (n < k) break;
            for (int y = x; ; y++) {
                k = g(x, y, y);
                if (n < k) break;
                for (int z = y; ; z++) {
                    k = g(x, y, z);
                    if (n < k) break;
                    int w = h(x, y, z);
                    a[k - 1] += w;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            out.println(a[i]);
        }
        out.close();
    }

    static int g(int x, int y, int z) {
        return x * x + y * y + z * z + x * y + y * z + z * x;
    }

    static int h(int x, int y, int z) {
        return x == y ? (y == z ? 1 : 3) : (y == z ? 3 : 6);
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
