import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean canTravel = true;
        for (int i = 0; i < n; i++) {
            int time = 0;
            int distance = 0;
            if (i-1 < 0) {
                time = t[i];
                distance = Math.abs(x[i]) + Math.abs(y[i]);
            } else {
                time = t[i] - t[i-1];
                distance = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
            }


            if (time < distance) {// 移動する時間が足りない
                canTravel = false;
                break;
            }

            if (time % 2 != distance % 2) {
                canTravel = false;
                break;
            }
        }

        System.out.println(canTravel ? "Yes" : "No");
    }
}
