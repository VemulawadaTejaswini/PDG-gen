import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = Integer.parseInt(sc.next());
            a[i][1] = Integer.parseInt(sc.next());
            a[i][2] = Integer.parseInt(sc.next());
        }
        int x = 0;
        int y = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            int xy = Math.abs(x - a[i][1]) + Math.abs(y - a[i][2]);
            x = a[i][1];
            y = a[i][2];
            int tt = a[i][0] - t;
            t = a[i][0];
            if (xy > tt) {
                System.out.println("No");
                return;
            } else if ((xy % 2 == 0 && tt % 2 != 0) || (xy % 2 != 0 && tt % 2 == 0)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}