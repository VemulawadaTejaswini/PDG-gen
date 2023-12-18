import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int cnt_r = 0;
		int cnt_b = 0;
		for (int i=0;i<N;i++) {
			if (s.charAt(i)=='R') {
				cnt_r++;
			} else {
				cnt_b++;
			}
		}

		if (cnt_r>cnt_b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}