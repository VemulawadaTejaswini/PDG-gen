import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        if (c > b && b > a) {
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i <= k; i++) {
            for (int j = 0; i+j <= k; j++) {
                int b2 = b * (int)Math.pow(2,i);
                int c2 = c * (int)Math.pow(2,j);
                if (c2 > b2 && b2 > a) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
