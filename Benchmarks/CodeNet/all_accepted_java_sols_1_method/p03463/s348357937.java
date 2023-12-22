import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nab = br.readLine().split(" ");
        int n = Integer.parseInt(nab[0]);
        int a = Integer.parseInt(nab[1]);
        int b = Integer.parseInt(nab[2]);
        String ans;
        
        if (Math.abs(a-b) % 2 == 1) {
            ans = "Borys";
        }
        else {
            ans = "Alice";
        }
        
        System.out.println(ans);
    }
}
