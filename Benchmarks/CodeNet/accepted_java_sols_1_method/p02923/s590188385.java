import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int max = 0;
		int before = 0;
		int cnt = 0;
		for (int i=0;i<N;i++) {
			int H = Integer.parseInt(sc.next());
			if (before>=H) {
				cnt++;
			} else {
				cnt=0;
			}
			before = H;
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}