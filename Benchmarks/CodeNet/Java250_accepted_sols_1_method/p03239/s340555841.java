import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int timeLimit = sc.nextInt();
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int t = sc.nextInt();
            if (t <= timeLimit && c < minCost) {
                minCost = c;
            }
        }
        sc.close();

        if (minCost != Integer.MAX_VALUE) {
            System.out.println(minCost);
        } else {
            System.out.println("TLE");
        }
    }

}
