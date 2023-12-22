import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n / 11;
        long b = n % 11;
        long c;
        if (b == 0) {
            c = 0;
        } else if (b <= 6) {
            c = 1;
        } else {
            c = 2;
        }
        
        long answer = a * 2 + c;
        
        // 5 11 16 22 27 33 38 44
        
        System.out.println(answer);
    }
}