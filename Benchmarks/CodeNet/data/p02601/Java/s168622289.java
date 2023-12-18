import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        while (a >= b) {
            b *= 2;
            ans++;
        }

        while (b >= c) {
            c *= 2;
            ans++;
        }

        if (ans <= k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();

    }

}