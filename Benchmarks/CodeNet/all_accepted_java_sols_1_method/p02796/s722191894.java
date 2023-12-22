import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] Z = new int[N][2];
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int L = sc.nextInt();
			Z[i][0] = X - L;
			Z[i][1] = X + L;
		}
		Arrays.sort(Z, (x,y) -> x[1]-y[1]);
		int ans = 1, point = Z[0][1];
		for(int i = 1; i < N; i++) {
			if(Z[i][0] >= point) {
				ans++;
				point = Z[i][1];
			}
		}	
		System.out.println(ans);

	}

}