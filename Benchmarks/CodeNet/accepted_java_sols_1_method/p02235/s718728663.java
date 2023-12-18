import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int n = 0; n < q; n++) {
            String x = scanner.next();
            String y = scanner.next();
            int[][] c = new int[x.length() + 1][y.length() + 1];
            for (int i = 1; i < x.length() + 1; i++) {
                for (int j = 1; j < y.length() + 1; j++) {
                    if (x.charAt(i - 1) == y.charAt(j - 1)) {
                        c[i][j] = c[i - 1][j - 1] + 1;
                    } else {
                        c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                    }
                }
            }
            System.out.println(c[x.length()][y.length()]);
        }
    }
}