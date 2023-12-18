
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int total = 0;
        for (int s=1; s <= N; s++) {
            String value = String.valueOf(s);
            int length = value.length();

            int sum = 0;
            for (int t=0; t < length; t++) {
                sum += value.charAt(t) - '0';
            }

            if (sum >= A && sum <= B) {
                total += s;
            }
        }
        System.out.println(total);
    }
}
