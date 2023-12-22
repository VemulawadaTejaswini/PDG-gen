import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int ans = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if(H[i] >= max) {
				max = H[i];
				ans += 1;
			}
		}
		System.out.println(ans);

	}

}