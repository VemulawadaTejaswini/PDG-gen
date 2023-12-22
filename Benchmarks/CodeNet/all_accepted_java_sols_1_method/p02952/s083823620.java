import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            String strN = String.valueOf(i);
            if (strN.length() % 2 != 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}