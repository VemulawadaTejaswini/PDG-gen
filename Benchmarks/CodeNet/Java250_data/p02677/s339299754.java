
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    
         
    static FastReader in;
    static StringBuilder out;


    public static double dist(int x1, int b, double angle){
        double x2=b*Math.cos(angle), y2=b*Math.sin(angle);
        return Math.sqrt(Math.pow((x2-x1), 2)+y2*y2);
    }
    public  static void main(String[] args) {
        
        in = new FastReader();
        int a=in.nextInt(),b=in.nextInt(),h=in.nextInt(),m=in.nextInt();
        double minAn=2*Math.PI/60;
        minAn=minAn*(m%60);
        double houAn=2*Math.PI/720;
        houAn=houAn*(((h*60)+m)%720);
        System.out.println(dist(a, b, Math.abs(houAn-minAn)));
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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