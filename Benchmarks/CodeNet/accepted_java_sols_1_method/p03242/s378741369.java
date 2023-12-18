import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] ans = new String[3];
        for (int i = 0; i < 3; i++) {
            if (line.charAt(i) == '1') {
                ans[i] = "9"; 
            }
            if (line.charAt(i) == '9') {
                ans[i] = "1"; 
            }
        }
        
        String a = String.join("", ans);
        
        System.out.println(a);
    }
}
