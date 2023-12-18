import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] ts = new int[N + 1];
        int[] xs = new int[N + 1];
        int[] ys = new int[N + 1];

        ts[0] = 0;
        xs[0] = 0;
        ys[0] = 0;
        for (int i = 0; i < N; i++) {
            ts[i + 1] = sc.nextInt();
            xs[i + 1] = sc.nextInt();
            ys[i + 1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int duration = ts[i + 1] - ts[i];
            int distance = Math.abs(xs[i + 1] - xs[i]) + Math.abs(ys[i + 1] - ys[i]);
            boolean just = (distance == duration);
            boolean ok = (duration > distance && ((duration - distance) % 2 == 0));
            if (!just && !ok) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}