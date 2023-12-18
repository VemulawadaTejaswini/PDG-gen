import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int ans = 1000;
        for (int i = 0; i <= S.length() - 3; i++) {
            int s = Integer.parseInt("" + S.charAt(i) + S.charAt(i+1) + S.charAt(i+2));
            ans = Math.min(ans, Math.abs(753 - s));
        }

        System.out.println(ans);
    }
}
