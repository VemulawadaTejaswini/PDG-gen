import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abc = br.readLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);
        String ans = "NO";
        int sum = 0;
        int num;
        for (int i = 1; i <= b ;i++) {
            num = a * i;
            if (num % b == c) ans = "YES";
        }
        
        System.out.println(ans);
    }
}
