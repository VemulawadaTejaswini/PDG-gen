
import java.util.Scanner;

public class Main {

    private static String solve(String s, int k) {
        if (s.length() == k || s.length() < k)
            return s;

        return s.substring(0, k) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        String res = solve(s, k);
        System.out.println(res);
    }
}
