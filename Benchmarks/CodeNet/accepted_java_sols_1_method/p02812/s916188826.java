import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final String s = sc.next();

        int ans = 0;
        for (int i = 0; i < n-2; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
