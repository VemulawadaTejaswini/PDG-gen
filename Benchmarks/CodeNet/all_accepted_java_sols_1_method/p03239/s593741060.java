import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int c = scanner.nextInt();
            int t = scanner.nextInt();
            if (t <= T) minCost = Math.min(minCost, c);
        }
        if (minCost != Integer.MAX_VALUE) System.out.println(minCost);
        else System.out.println("TLE");
    }
}
