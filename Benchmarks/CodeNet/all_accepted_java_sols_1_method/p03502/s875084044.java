import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String ans;
        int x2 = x;
        int fx = 0;
        
        while (x2 > 0) {
            fx += x2 % 10;
            x2 /= 10;
        }
        
        if (x % fx == 0) ans = "Yes";
        else ans = "No";
        System.out.println(ans);
    }
}
