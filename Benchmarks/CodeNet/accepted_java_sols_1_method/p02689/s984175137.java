import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] peaks = new int[2][N];

        for (int i = 0; i < N; i++) {
            peaks[0][i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (peaks[0][A - 1] > peaks[0][B - 1]) {
                peaks[1][B - 1]++;
            } else if (peaks[0][A - 1] < peaks[0][B - 1]) {
                peaks[1][A - 1]++;
            } else {
                peaks[1][A - 1]++;
                peaks[1][B - 1]++;
            }
        }
        scanner.close();
        int ans = 0;
        for (int index : peaks[1]) {
            if (index == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
