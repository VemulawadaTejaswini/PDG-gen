import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        CP sc = new CP();
        int a= sc.nextInt(), b= sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int x,y;
        if(a<0&&b<0){
            x = Math.max(a,b);
        }else{
            x = Math.max(a,b);
        }
        if(d<0&&b>=0){
            x = Math.min(a,b);
            y = Math.max(c,d);
        }else if(a>=0&&c>=0){
            x = Math.max(a,b);
            y = Math.max(c,d);
        }else if(b<0&&d>=0){
            x = Math.max(a,b);
            y = Math.min(c,d);
        }else{
            x = Math.min(a,b);
            y = Math.min(c,d);
        }
        System.out.println((long)x*y);
    }

    /*****************************************************************************/
    static class CP {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        public CP() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        int nextInt() {
            return Integer.parseInt(NNNN());
        }

        long nextLong() {
            return Long.parseLong(NNNN());
        }

        double nextDouble() {
            return Double.parseDouble(NNNN());
        }

        String NNNN() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        String nextLine() {
            String spl = "";
            try {
                spl = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return spl;
        }
    }
    /*****************************************************************************/
}