import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        
        long max = 0;
        long y = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 2; j <= 1000; j++) {
                y = (long)Math.pow(i, j);
                if (y <= x && y > max) max = y;
            }
        }
        
        System.out.println(max);
    }
}
