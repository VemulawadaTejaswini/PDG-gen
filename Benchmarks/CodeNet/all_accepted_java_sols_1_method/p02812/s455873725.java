
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        char[] s = S.toCharArray();

        int count = 0;
        for (int i = 0 ; i < N - 2 ; i++) {
            if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') {
                count++;
            }
        }

        System.out.println(count);
    }
}
