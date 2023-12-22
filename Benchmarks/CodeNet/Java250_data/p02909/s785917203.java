import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S));
    }

    private static String solve(String S) {
        if (S.equals("Sunny"))  return "Cloudy";
        if (S.equals("Cloudy")) return "Rainy";

        return "Sunny";
    }
}
