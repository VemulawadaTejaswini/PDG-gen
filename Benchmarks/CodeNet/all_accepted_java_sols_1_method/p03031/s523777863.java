import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] k = new int[M];
        int[][] s = new int[M][];
        for (int i = 0; i < k.length; i++) {
            k[i] = sc.nextInt();
            s[i] = new int[k[i]];
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[M];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        
        int res = 0;
        for (int bit = 0; bit < (1 << N); bit++) {
            boolean ok = true;
            for (int i = 0; i < k.length; i++) {
                int on_counter = 0;
                for (int j = 0; j < s[i].length; j++) {
                    if ((bit & (1 << (N - s[i][j]))) != 0) {
                        on_counter++;
                    }
                }
                if (on_counter % 2 != p[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}