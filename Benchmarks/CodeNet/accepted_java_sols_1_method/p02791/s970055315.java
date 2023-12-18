import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC152C - Low Elements

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];

        int max = 0;
        int min = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            if (i == 0) {
                max = min = p[i];
            }
            if (min >= p[i]) {
                ++cnt;
                min = p[i];
            } else {
                max = p[i];
            }
        }

        System.out.println(cnt);
    }
}