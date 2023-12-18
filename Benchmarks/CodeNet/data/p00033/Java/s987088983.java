
import java.util.Scanner;

public class Main {
    Scanner sc;
    void run() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[10];
        A:
        for (int i=0;i<n;i++) {
            int[] box = new int[2];
            boolean flg = false;
            for (int h=0;h<10;h++) x[h] = sc.nextInt();
            for (int h=0;h<10;h++) {
                int p = 0;
                flg = false;
                for (int j=0;j<2;j++) {
                    if (box[p] < x[h]) {
                        box[p] = x[h];
                        flg = true;
                        break;
                    }
                    else p = (p + 1) % 2;
                }
                if (!flg) {
                    System.out.println("NO");
                    break;
                }
            }
            if(flg) System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}