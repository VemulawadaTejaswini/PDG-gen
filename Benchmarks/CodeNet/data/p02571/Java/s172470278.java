import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int longest = 0;
        for (int i = S.length() - 1; i > 0; i--) {
            for (int j = T.length() - 1; j > 0; j--) {
                int m = i;
                int n = j;
                int temp = 0;
                while (m >= n && m >= 0 && n >= 0 &&  S.charAt(m--) == T.charAt(n--)) {
                    temp++;
                }
                longest = Math.max(temp, longest);
            }
        }
        int result = T.length() - longest;
        System.out.println(result);
    }
}
