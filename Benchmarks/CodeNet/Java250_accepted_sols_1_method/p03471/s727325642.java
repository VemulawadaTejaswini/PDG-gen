import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N, Y;
        N = scanner.nextInt();
        Y = scanner.nextInt();
        int x =0;
        int y =0;
        int z =0;
        loop: for (int i = 0; i < N+1; i++) {
            for (int j = 0, k = N - i - j; j <= N - i; j++, k--) {
                if (Y == 10000 * i + 5000 * k + 1000 * j) {
                    x = i;
                    y = k;
                    z = j;
                    break loop;
                }else{
                     x = -1;
                     y = -1;
                     z = -1;
                }
            }
        }
        System.out.println(x+" "+y+" "+z);
    }
}
