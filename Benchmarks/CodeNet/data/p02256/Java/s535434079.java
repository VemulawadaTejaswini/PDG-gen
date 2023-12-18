import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(
         System.in));
         String arrStr = reader.readLine();
         StringTokenizer tokenizer = new StringTokenizer(arrStr, " ");

         int a = Integer.parseInt(tokenizer.nextToken());
         int b = Integer.parseInt(tokenizer.nextToken());

        System.out.println(gcd(a, b));
    }

    static int gcd(int m, int n) {
        
        //m ??則 n
        if(m < n){
            gcd(n, m);
        }
        
        int r;
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        
        return n;
    }

}