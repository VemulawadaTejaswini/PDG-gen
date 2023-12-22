import java.util.Scanner;

public class Main {
    static private final String ACGT = "ACGT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (ACGT.contains((String.valueOf(S.charAt(i))))) {
                ans = Math.max(ans, ++tmp);
            } else {
                tmp = 0;
            }
        }

        System.out.println(ans);
    }
}