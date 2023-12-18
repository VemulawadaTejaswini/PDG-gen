import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        int border = X < 0 ? -1 : 1;
        long tmp = X;
        for (int i = 0; i < K; i++) {
            if (0 == X) {
                System.out.println(K%2 == 0 ? 0 : D);
                return;
            } else if (0 < X) {
                if (border == -1 && K%2 == 0) {
                    System.out.println(X);
                    return;
                } else if (border == -1 && K%2 == 1) {
                    System.out.println(-tmp);
                    return;
                }
                tmp = X;
                X -= D;
            } else if (X < 0) {
                if (border == 1 && K%2 == 0) {
                    System.out.println(X);
                    return;
                } else if (border == 1 && K%2 == 1) {
                    System.out.println(tmp);
                    return;
                }
                tmp = X;
                X += D;
            }
            K--;
        }
        System.out.println(X < 0 ? -X : X);
    }
}