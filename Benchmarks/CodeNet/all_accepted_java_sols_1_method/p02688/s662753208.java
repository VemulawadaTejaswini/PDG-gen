import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] b = new boolean[n];
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int a = sc.nextInt();
                b[a - 1] = true;
            }
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
