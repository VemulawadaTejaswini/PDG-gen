import java.util.Scanner;

/**
 * One Clue
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();
            int X = sc.nextInt();

            int min = X - K + 1;
            int max = X + K - 1;

            StringBuilder ans = new StringBuilder();
            ans.append(min);
            for (int i = min + 1; i <= max; i++) {
                ans.append(" ").append(i);
            }

            System.out.println(ans.toString());
        }
    }

}
