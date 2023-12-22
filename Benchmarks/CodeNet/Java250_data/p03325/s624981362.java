import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            while (num % 2 == 0) {
                ans++;
                num /= 2;
            }
        }

        System.out.println(ans);

        sc.close();

    }

}