import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		{
			boolean p[] = new boolean[50001];
			for(int i = 0; i < 50001; i++) {
				p[i] = true;
			}
			p[0] = false;
			p[1] = false;
			for(int i = 2; i < 50001; i++) {
				if(p[i]) {
					al.add(i);
					if(i*i < 50001)
						for(int j = 2*i; j < 50001; j += i)
							p[j] = false;
				}
			}
		}
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int ans = 0;
			for(int i : al) {
				if(2 * i > n) break;
				if(Collections.binarySearch(al, n - i) >= 0) {
					ans ++;
				}
			}
			System.out.println(ans);
		}
	}
}