import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();

		int[] t = new int[N];
		
		int select = 0;
		int tmp = 300;
		for(int i = 0; i < N; i++) {
			t[i] = L + i;
			int val = Math.abs(t[i]);
			if(tmp > val) {
				select = i;
				tmp = val;
			}
		}
		
		t[select] = 0;
		int ans = 0;
		for(int a: t) {
			ans += a;
		}
		
		System.out.println(ans);
		scan.close();
	}

}
