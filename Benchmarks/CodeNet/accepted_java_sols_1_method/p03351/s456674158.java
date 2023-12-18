import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str_abcd = br.readLine().split(" ");
        int a = Integer.parseInt(str_abcd[0]);
        int b = Integer.parseInt(str_abcd[1]);
        int c = Integer.parseInt(str_abcd[2]);
        int d = Integer.parseInt(str_abcd[3]);
        
        String ans = "No";
        if ((Math.abs(b - a) <= d && Math.abs(c - b) <= d) || Math.abs(c - a) <= d) {
            ans = "Yes";
        }
        
        
        System.out.println(ans);
    }
}
