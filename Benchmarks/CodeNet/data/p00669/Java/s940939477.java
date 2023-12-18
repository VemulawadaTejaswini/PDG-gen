import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int k = in.nextInt();
            if((n|k) == 0)break;
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
            long C = calc(c, k, n);
            long CC = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int tmp = c[i];
                    c[i] = c[j];
                    c[j] = tmp;
                    CC = Math.max(calc(c, k, n), CC);
                }
            }
            if (CC < C) {
                System.out.println("NO GAME");
            } else {
                System.out.println("" + (CC - C));
            }
        }
    }
    static long calc(int[] c, int k, int n){
        int t = 1;
        for (int i = 0; i < k; i++) {
            t *= c[i];
        }
        int C = t;
        for (int i = k; i < n; i++) {
            t/=c[i-k];
            t*=c[i];
            C = Math.max(t,C);
        }
        return C;
    }
}