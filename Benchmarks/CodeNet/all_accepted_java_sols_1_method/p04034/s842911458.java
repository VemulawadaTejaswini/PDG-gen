import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        Arrays.fill(num, 1);
        boolean[] red = new boolean[N];
        red[0] = true;
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            num[x]--;
            num[y]++;
            // move
            if (red[x]) {
                red[y] = true;
            }
            // clear
            if (num[x] == 0) {
                red[x] = false;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (red[i]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
