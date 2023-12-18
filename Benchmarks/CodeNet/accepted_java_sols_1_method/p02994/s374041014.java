import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int l = sc.nextInt();
        int ans = 0, min = l;
        
        for (int i = 1; i <= n; i ++) {
            int m = l + i - 1;
            ans += m;
            if (Math.abs(m) < Math.abs(min)) {
                min = m;
            }
        }
        ans -= min;

        System.out.println(ans);

		sc.close();
	}
}
