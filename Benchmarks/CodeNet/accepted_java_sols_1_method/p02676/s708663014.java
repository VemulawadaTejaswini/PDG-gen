import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();
            String S = sc.next();
            System.out.println(S.length() <= K ? S : (S.substring(0, K) + "..."));
        }
    }
}
