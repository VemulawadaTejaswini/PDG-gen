import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long answer = 0;
        if (n % (a + b) == 0) {
            if (n < a+b) {
                if (n < a) {
                    answer = n;
                } else {
                    answer = a;
                }
            } else {
                answer = a * (n / (a + b));
            }
        } else if (n % (a + b) > a) {
            answer = a * (n / (a + b)) + a;
        } else {
            answer = a * (n / (a + b)) + (n % (a + b));
        }
        System.out.println(answer);
    }
}