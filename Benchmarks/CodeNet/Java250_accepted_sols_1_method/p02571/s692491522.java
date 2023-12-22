import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int ns = s.length(), nt = t.length();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + nt <= ns; i++) {
            int diff = 0;
            for (int j = 0; j < nt; j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    diff++;
                }
            }
            ans = Math.min(diff, ans);
        }
        System.out.println(ans);
    }
}