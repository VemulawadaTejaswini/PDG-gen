import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long k =  Long.parseLong(br.readLine());
        
        char ans = '1';
        
        //if 
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) != '1') {
                ans = s.charAt(i);
                break;
            }
        }
        System.out.println(ans);
    }
    
    
}
