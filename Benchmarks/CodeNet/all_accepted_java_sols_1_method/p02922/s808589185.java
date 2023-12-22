import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int sum = 1;
		int ans = 0;
		for (int i=0;i<100;i++) {
			if (sum>=B) {
				break;
			}
			ans++;
			sum+=A-1;
		}
		System.out.println(ans);
	}
}