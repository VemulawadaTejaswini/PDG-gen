import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] title = new String[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            title[i] = sc.next();
            time[i] = sc.nextInt();
        }
        String x = sc.next();

        boolean isSleeping = false;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (isSleeping) {
                ans += time[i];
            } else if (x.equals(title[i])) {
                isSleeping = true;
            }
        }

        System.out.println(ans);
    }
}