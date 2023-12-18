import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();

        if (S.length() <= K) {
            System.out.println(S);
        } else {
            String truncated = S.substring(0, K);
            System.out.println(truncated + "...");
        }
    }
}