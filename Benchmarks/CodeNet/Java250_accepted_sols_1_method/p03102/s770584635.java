import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int b[] = new int[m];
        int suc = 0;
        int anm = 0;
        int ab = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            anm = 0;
            ab = 0;
            for (int j = 0; j < m; j++) {
                anm = sc.nextInt();
                ab = anm * b[j];
                sum = sum + ab;
            }

            if (sum + c > 0) {
                suc++;
            }

        }

        System.out.println(suc);

        sc.close();
    }
}
