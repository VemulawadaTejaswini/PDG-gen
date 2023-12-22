import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();

            char[] cs = S.toCharArray();

            int count = 0;
            for (int i = 0; i < N - 2; i++) {
                if (cs[i] == 'A' && cs[i + 1] == 'B' && cs[i + 2] == 'C') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}