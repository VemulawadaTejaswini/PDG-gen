import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n], y = new int[n], h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for (int xx = 0; xx <= 100; xx++) {
            loop:
            for (int yy = 0; yy <= 100; yy++) {
                int hh = 0;
                for (int j = 0; j < n; j++) {
                    if (h[j] == 0) continue;
                    hh = h[j] + Math.abs(x[j] - xx) + Math.abs(y[j] - yy);
                    break;
                }

                for (int i = 0; i < n; i++) {
                    if(h[i] != Math.max(0, hh - Math.abs(x[i] - xx) - Math.abs(y[i] - yy))) {
                        continue loop;
                    }
                }

                System.out.println(xx + " " + yy + " " +hh);
                return;
            }
        }
    }
}