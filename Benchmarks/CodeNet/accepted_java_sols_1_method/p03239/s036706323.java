import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        boolean check = false;
        int[] cost = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
            time[i] = sc.nextInt();
            if (cost[i] < min && time[i] <= t) {
                min = cost[i];
                check = true;
            }
        }
        if (check) {
            System.out.println(min);
        } else {
            System.out.println("TLE");
        }
    }
}