import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] r = new int[M][2];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            r[i][0] = a;
            r[i][1] = b;
        }
        Arrays.sort(r, (a,b)->a[0]-b[0] != 0 ? a[0]-b[0] : a[1]-b[1]);
        int ans = 1;
        int nowA = r[0][0];
        int nowB = r[0][1];
        for (int i = 1; i < M; i++) {
            if (nowA < r[i][1] && r[i][0] < nowB) {
                nowA = Math.max(nowA,r[i][0]);
                nowB = Math.min(nowB,r[i][1]);
            } else {
                ans++;
                nowA = r[i][0];
                nowB = r[i][1];
            }
        }

        System.out.println(ans);
    }
}
