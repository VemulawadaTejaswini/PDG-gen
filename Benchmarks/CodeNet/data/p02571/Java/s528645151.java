import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        scanner.close();

        int ans = Integer.MAX_VALUE;
        if (S.contains(T)) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < S.length() - T.length(); i++) {
            int temp = 0;
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i + j) != T.charAt(j)) {
                    temp++;
                }
            }
            if (temp < ans) {
                ans = temp;
            }
        }

        System.out.println(ans);
    }

}
