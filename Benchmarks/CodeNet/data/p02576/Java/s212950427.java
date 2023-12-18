import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //この個数を作るのに何分かかる
        int X = sc.nextInt(); //1度に作れるたこ焼き
        int T = sc.nextInt(); //1度に使う時間

        int outT = 0;

        while (N>0) {
            outT = outT+T;
            N=N-X;
        }
        System.out.println(outT);
    }
}