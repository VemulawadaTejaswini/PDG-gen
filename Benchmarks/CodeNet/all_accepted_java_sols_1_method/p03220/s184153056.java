import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double[] H = new double [N];
        for (int i = 0; i < N; ++i) {
            H[i] = sc.nextInt();
        }

        double[] dif = new double [N];
        int ans = 0;
        for (int i = 0; i < N; ++i) {
            dif[i] = Math.abs(T - H[i] * 0.006 - A);
            if(dif[i] < dif[ans]) {
                ans = i;
            }
        }

        System.out.println(ans + 1);
	}
}
