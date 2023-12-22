import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] d = new int[N];
        for (int i = 1; i < N; i++) {
            for (int j = i+1; j <= N; j++) {
                int dist = Math.min(j-i, Math.abs(X-i)+Math.abs(Y-j)+1);
                d[dist]++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < N; i++) {
            ans.append(d[i]).append('\n');
        }

        System.out.print(ans);
    }
}

