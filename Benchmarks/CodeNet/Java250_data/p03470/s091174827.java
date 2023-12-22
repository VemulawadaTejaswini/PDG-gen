import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] flag = new int[101];
		Arrays.fill(flag, 0);
		
		for(int i = 0; i < N; i++) {
			int d = stdIn.nextInt();
			flag[d] = 1;
		}
		
		int ans = 0;
		for(int i = 0; i < 101; i++) {
			ans += flag[i];
		}
		
		System.out.println(ans);

	}

}