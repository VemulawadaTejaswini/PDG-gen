import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++)
			H[i] = sc.nextInt();
		int zantei = 0, ans = 0;
		for(int i = 0; i < N-1; i++) {
			if(H[i+1] <= H[i])
				zantei++;
			else {
				ans = Math.max(zantei, ans);
				zantei = 0;
			}
		}
		ans = Math.max(zantei, ans);
		System.out.println(ans);

	}

}