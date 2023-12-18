import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int[] p = new int[d];
        int[] c = new int[d];

        for (int i = 0; i < d; i++) {
            p[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << d); i++) {
            int point = 0;
            int count = 0;
            for (int j = 0; j < d; j++) {
                if((1 & i >> j) == 1) {
                    point += p[j] * (100 * (j+1)) + c[j];
                    count += p[j];
                }
            }
            if (g <= point) {
                res = Math.min(res, count);
            }else  {
                for (int j = d - 1; j >= 0; j--) {
                    if (( 1 & i >> j) == 1) {
                        continue;
                    }
                    for (int k = 0; k < p[j]; k++) {
                        if (g <= point) {
                            break;
                        }
                        point += 100 * (j + 1);
                        count++;
                    }
                }
            }
            if(g <= point) {
                res = Math.min(res, count);
            }
        }
        System.out.println(res);
    }
}
