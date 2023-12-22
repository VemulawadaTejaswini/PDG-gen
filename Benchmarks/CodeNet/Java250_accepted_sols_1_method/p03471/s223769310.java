import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// N枚
        int Y = sc.nextInt();// Y円

        int x = -1;// 10000円をx枚
        int y = -1;// 5000円をy枚
        int z = -1;// 1000円をz枚

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int tmpX = i;
                int tmpY = j;
                int tmpZ = N - (i+j);
                if (tmpZ < 0) break;

                int tmpSum = (10000 * tmpX) + (5000 * tmpY) + (1000 * tmpZ);
                if (tmpSum == Y) {
                    x = tmpX;
                    y = tmpY;
                    z = tmpZ;

                    break;
                }
            }
        }

        System.out.println(x + " " + y + " " + z);
    }
}
