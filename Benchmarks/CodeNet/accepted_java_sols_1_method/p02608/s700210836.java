import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cnt = new int[10000+1];
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int f = x*x+y*y+z*z+x*y+y*z+z*x;
                    if (f <= 10000) cnt[f]++;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            ans.append(cnt[i]).append('\n');
        }
        System.out.print(ans);
    }
}
