import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        if (d < 22) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 22; j <= d; j++) {
                if (j / 10 < 2 || j % 10 < 2) {
                    continue;
                }
                if ((j / 10) * (j % 10) == i) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
