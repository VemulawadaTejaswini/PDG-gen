import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vals = new int[n];
        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }

        int tot = 0;

        for (int i = 0; i < n; i++) {
            tot += Math.max(0, vals[i] - costs[i]);
        }

        System.out.println(tot);
    }
}
