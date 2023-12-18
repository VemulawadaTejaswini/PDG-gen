import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = 0;
        int R = 0;
        int Lmax = 0;
        int Rmin = 100000;

        for (int i = 0; i < M; i++) {
            L = sc.nextInt();
            if (L > Lmax) {
                Lmax = L;
            }
            R = sc.nextInt();
            if (R < Rmin) {
                Rmin = R;
            }
        }
        int judge = Rmin - Lmax + 1;
        if (judge < 0) {
            judge = 0;
        }
        System.out.println(judge);
        sc.close();
    }
}