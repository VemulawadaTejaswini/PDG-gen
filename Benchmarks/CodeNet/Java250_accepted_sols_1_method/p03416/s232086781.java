import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int ans = 0;

        for (int x = A; x <= B; x++) {
            char[] cs = String.valueOf(x).toCharArray();
            if (cs[0] == cs[4] && cs[1] == cs[3]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
