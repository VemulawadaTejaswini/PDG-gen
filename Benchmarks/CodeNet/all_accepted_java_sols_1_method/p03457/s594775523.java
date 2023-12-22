import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] t = new int[N + 1];
        int [] x = new int[N + 1];
        int [] y = new int [N + 1];
        for (int i = 1 ; i <= N ; i++ ) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        //t とx + yのmod 2が等しくないとダメ・
        //t2 - t1秒間で (x2 - x1) + (y2 - y1)以上移動できないとダメ
        boolean isPossible = true;
        for (int i = 1 ; i <= N ; i++) {
            if (t[i] % 2 != (x[i] + y[i]) % 2) {
                isPossible = false;
                break;
            }
            if (t[i] - t[i -1] < Math.abs(x[i] - x[i -1]) + Math.abs(y[i] - y[i -1])) {
                isPossible = false;
                break;
            }
        }
        if (isPossible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}