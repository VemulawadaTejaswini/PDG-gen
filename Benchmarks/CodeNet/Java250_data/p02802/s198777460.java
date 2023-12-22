import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] wa = new int[N];
		boolean[] clear = new boolean[N];
		int waCnt = 0;
		int ac = 0;
		
		for (int i=0; i<M; i++) {
			int p = sc.nextInt() - 1;
			String s = sc.next();
			
			if (!clear[p]) {
				if (s.equals("AC")) {
					clear[p] = true;
					waCnt += wa[p];
					ac++;
				} else {
					wa[p]++;
				}
			}
		}
		
		System.out.println(ac + " " + waCnt);
	}
}