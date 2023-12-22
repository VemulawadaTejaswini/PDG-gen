import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int now = sc.nextInt();
            if (max - 1 > now) {
                System.out.println("No");
                return;
            } else if (now > max) {
                max = now;
            }
        }

        System.out.println("Yes");

        sc.close();

    }

}