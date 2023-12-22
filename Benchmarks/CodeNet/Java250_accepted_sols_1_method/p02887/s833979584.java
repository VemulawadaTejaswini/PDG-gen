
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        if (N < 1) {
            System.out.println(0);
            return;
        }

        char lastChar = S.charAt(0);
        int res = 1;
        for (int i = 1; i < N; i++) {
            if (lastChar == S.charAt(i)) {
                continue;
            } else {
                lastChar = S.charAt(i);
                res ++;
            }
        }
        System.out.println(res);
    }
}