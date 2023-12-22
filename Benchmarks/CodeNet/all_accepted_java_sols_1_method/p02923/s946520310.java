import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int tmp = 0;
		int[] H = new int[N];
		Arrays.setAll(H, i->sc.nextInt());
		
		for (int i=0; i<N-1; i++) {
			if (H[i] >= H[i+1]) {
				tmp++;
				ans = Math.max(ans, tmp);
			} else {
				tmp = 0;
			}
		}
		System.out.println(ans);
	}
}