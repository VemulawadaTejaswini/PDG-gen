import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<List<Integer[]>> p = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			List<Integer[]> ops = new ArrayList<>();
			for (int j = 0; j < Ai; j++) {
				Integer[] op = new Integer[2];
				op[0] = sc.nextInt();
				op[1] = sc.nextInt();
				ops.add(op);
			}
			p.add(ops);
		}
		for (int i = (1 << N) - 1; 0 < i; i--) {
			boolean[] ans = new boolean[N];
			for (int j = 0; j < N; j++) {
				if (((i>>j)&1) == 1) {
					ans[j] = true;
				}
			}
			boolean flg = true;
			for (int k = 0; k < N; k++) {
				if (ans[k]) {
					for (Integer[] opi : p.get(k)) {
						if ((ans[opi[0]-1] && opi[1] == 1)
								|| (!ans[opi[0]-1] && opi[1] == 0)) {
							continue;
						} else {
							flg = false;
							break;
						}
					}
				}
			}
			if (flg) {
				int count = 0;
				for (boolean b : ans) {
					if (b) {
						count++;
					}
				}
				if (max < count) {
					max = count;
				}
			}
		}
		System.out.println(max);
	}
}