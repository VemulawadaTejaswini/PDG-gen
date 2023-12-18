import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();

            if (N % 2 == 0) {
                if (S.substring(0, S.length() / 2).equals(S.substring(S.length() / 2))) {
                    System.out.println("Yes");
                    return;
                }
            }

            System.out.println("No");
        }
    }

}
