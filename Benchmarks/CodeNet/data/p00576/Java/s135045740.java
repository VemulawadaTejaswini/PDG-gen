import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] data = new boolean[2019];
        int[] x = new int[101];
        for (int i = 0; i < n; ++i) {
            x[i] = scanner.nextInt() - 1;
            data[x[i]] = true;
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt() - 1;
            if (x[a] != 2018 && !data[x[a] + 1]) {
                data[x[a]] = false;
                data[x[a] + 1] = true;
                ++x[a];
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(x[i] + 1);
        }

    }
}

