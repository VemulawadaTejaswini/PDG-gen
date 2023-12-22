import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int ans = 0, digit1, digit2, digit4, digit5, temp;
        
        
        for (int i = a; i <= b; i++) {
            temp = i;
            digit5 = temp % 10;
            temp /= 10;
            digit4 = temp % 10;
            temp /= 10;
            temp /= 10;
            digit2 = temp % 10;
            temp /= 10;
            digit1 = temp % 10;
            
            if (digit1 == digit5 && digit2 == digit4) ans++;
        }
        
        System.out.println(ans);
    }
}
