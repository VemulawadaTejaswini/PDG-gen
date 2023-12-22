import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abx = br.readLine().split(" ");
        long a = Long.parseLong(abx[0]);
        long b = Long.parseLong(abx[1]);
        long x = Long.parseLong(abx[2]);
        
        /*int count = 0;
        for (long i = a; i <= b; i++) {
            if (i % x == 0) count++;
        }*/
        
        long ans = b/x - a/x;
        
        System.out.println(a%x==0?ans+1:ans);
    }
}
