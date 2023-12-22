import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (n < 0 || n > 1) {
            if (n >= 0) {
                sb.append(n % 2);
            } else {
                sb.append(-n % 2);
            }
            if (n % 2 != 0) {
                n = (n - 1) / -2;
            } else {
                n /= -2;
            }
        }
        sb.append(1);
        System.out.println(sb.reverse());
    }

}
