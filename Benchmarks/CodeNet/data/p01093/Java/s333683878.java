
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n > 0) {

            int t[] = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = scan.nextInt();
            }
            for (int h = 0; h < n - 1; h++) {
                for (int j = 0; j < n - 1 - h; j++) {
                    if (t[j] < t[j + 1]) {
                        int temp = t[j];
                        t[j] = t[j + 1];
                        t[j + 1] = temp;
                    }
                }
            }
            int m = 1000000000;
            for (int i = 0; i < n - 1; i++) {
                if (t[i] - t[i + 1] < m) {
                    m = t[i] - t[i + 1];
                }
            }
            System.out.println(m);
            n = scan.nextInt();
        }
    }
}

