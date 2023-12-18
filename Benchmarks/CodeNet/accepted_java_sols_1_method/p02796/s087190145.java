import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] inter = new int[N][2];
        int a,l;

        for (int i = 0; i < N; i++) {
           a = sc.nextInt();
           l = sc.nextInt();
           inter[i][0] = a-l;
           inter[i][1] = a+l;
        }

        int res = 0;
        int now = -9999999;

        Arrays.sort(inter, (x, y) -> Integer.compare(x[1], y[1]));

        for (int i = 0; i < N; i++) {
            if (now > inter[i][0]) continue;
            res++;
            now = inter[i][1];
        }

        System.out.println(res);

    }
}