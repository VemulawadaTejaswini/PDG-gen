import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int count = 0;
        int ans = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i%2==0) continue;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            
            if (count == 8) ans++;
            count = 0;
        }
        System.out.println(ans);
    }
    
    
}
