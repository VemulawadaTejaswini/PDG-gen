import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        double a = sc.nextDouble();
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int h =sc.nextInt();
            double tmp = t - h * 0.006d;
            if (min > Math.abs(tmp - a)) {
                min = Math.abs(tmp - a);
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}