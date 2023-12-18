
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int g = 0;
        while (n != 0 || m != 0) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int s = 0; s < n; s++) {
                for (int f = s+1; f < n; f++) {
                    if ((a[s] + a[f]) <= m && (a[s] + a[f]) >= g) {
                        g = a[s] + a[f];
                    }
                }
            }
            if (g == 0) {
                System.out.println("NONE");
            } else {
                System.out.println(g);
            }
            n = scanner.nextInt();
            m = scanner.nextInt();
            g =0;
        }
    }
}

