
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        for (int i = 0 ; i < S.length ; i++) {
            if ((i + 1) % 2 == 1) {
                if (S[i] == 'L') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (S[i] == 'R') {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
