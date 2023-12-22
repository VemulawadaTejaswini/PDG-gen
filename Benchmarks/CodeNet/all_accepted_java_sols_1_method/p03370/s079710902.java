import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] M = new int [N + 1];
        for (int i = 1; i <= N; ++i) {
            M[i] = sc.nextInt();
        }
        M[0] = 0;
        sc.close();

        Arrays.sort(M);
        int fl = X;
        for (int i = 1; i <= N; ++i) {
            fl -= M[i];
        }

        int ans = N;
        while (fl >= 0) {
            fl -= M[1];
            ans++;
        }

        System.out.println(ans - 1);
	}
}
