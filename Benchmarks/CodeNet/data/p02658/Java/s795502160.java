import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine().split(" ")[0]);
        long[] target = new long[n];
        for (int i = 0; i < n; i++) {
            target[i] = sc.nextLong();
        }
        long result = 1;
        long boader = (long) Math.pow(10, 18);
        outside: for (int i = 0; i < n; i++) {
            if (result * target[i] > boader) {
                for (int j = i; j < n; j++) {
                    if (target[j] == 0) {
                        result = 0;
                        break outside;
                    }
                }
                result = -1;
                break outside;
            }
            result *= target[i];
        }
        System.out.println(result);
    }
}
