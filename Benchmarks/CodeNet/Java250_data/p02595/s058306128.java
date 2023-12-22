import java.util.Scanner;

public class Main {
    public int count(int n, double d, int[][] coords) {
        int count = 0;
        for (int[] coord : coords) {
            double x = coord[0];
            double y = coord[1];

            if (Math.abs(x) > d || Math.abs(y) > d) {
                continue;
            } else {
                double dist = Math.sqrt(x * x + y * y);
                if (dist <= d) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[][] coords = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            coords[i][0] = x;
            coords[i][1] = y;
        }

        int answer = solution.count(n, d, coords);
        System.out.println(answer);
    }
}