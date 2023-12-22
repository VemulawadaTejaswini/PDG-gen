import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rootn = (long)Math.sqrt(n);
        
        String a = "";
        String b = "";
        for (long i = rootn; i >= 1; i--) {
            if (n % i == 0) {
                a = String.valueOf(i);
                b = String.valueOf(n / i);
                break;
            }
        }
        
        int answer = Math.max(a.length(), b.length());
        System.out.println(answer);
    }
}
