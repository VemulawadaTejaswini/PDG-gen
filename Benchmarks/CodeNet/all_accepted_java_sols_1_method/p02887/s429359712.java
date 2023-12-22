import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final char[] s = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < n; ) {
            char current = s[i];
            int j;
            for (j = i+1; j < n; j++) {
                if (current != s[j]) {
                    break;
                }
            }
            i = j;
            ans++;
        }
        System.out.println(ans);
    }
}
