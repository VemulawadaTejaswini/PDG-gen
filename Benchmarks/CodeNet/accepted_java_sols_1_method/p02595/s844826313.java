import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2)) <= (double) d) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
