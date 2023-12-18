import java.util.*;

class Main {

    void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] r = new int[n];
		for(int i = 0; i < n; i++){
			r[i] = in.nextInt();
		}
		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < n - 1; i++){
			for(int j = i+1; j < n; j++){
				ans = Math.max(ans, r[j] - r[i]);
			}
		}
		System.out.println(ans);
	}

    public static void main(String[] args) {
        new Main().solve();
    }
}