import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String N = sc.next();
            int sum = 0;
            for (int i = 0; i < N.length(); i++) {
                int n = N.charAt(i) - '0';
                sum += n;
            }
            System.out.println(sum % 9 == 0 ? "Yes" : "No");
        }
    }
}
