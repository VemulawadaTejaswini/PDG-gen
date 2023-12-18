import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int ans = 700;
        
        for (int i = 0; i < 3; i++) {
            if (line.charAt(i) == 'o') ans += 100;
        }
        
        System.out.println(ans);
    }
}
