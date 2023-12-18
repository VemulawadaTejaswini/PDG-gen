import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		r = new int[8];
		Arrays.fill(r, -1);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			r[sc.nextInt()] = sc.nextInt();
		}
		
		used = new boolean[8];
		perm = new int[8];
		permutation(0, 8);
		
    	String[] q = {"Q.......", ".Q......", "..Q.....", "...Q....", "....Q...", ".....Q..", "......Q.", ".......Q"};
    	for (int i = 0; i < 8; i++) {
    		System.out.println(q[res[i]]);
    	}
    	
        sc.close();
	}

	static int[] r;
	static int[] res;
	static boolean[] used;
	static int[] perm;

	// {0, 1, 2, 3, ...., n - 1}???????????????n!?????????????????????
	static void permutation(int pos, int n) {
		if (pos == n) {
			// perm[] ??????????????????
			for (int i = 0; i < n; i++) {
				if (r[i] != -1 && r[i] != perm[i]) {
					return;
				}
			}

			if (res == null) {
				// check
				boolean flag = true;
				for (int i = 0; i < n; i++) {
					for (int j = i + 1; j < n; j++) {
						if (perm[i] < n - (j - i) && perm[j] == perm[i] + j - i) {
							flag = false;
							break;
						}
						if (perm[i] >= j - i && perm[j] == perm[i] - (j - i)) {
							flag = false;
							break;
						}
					}
				}
				if (flag) {
					res = perm.clone();
				}
			}
			
			return;
		}
		// perm[]???pos?????????0???n-1?????????????????????????????????
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				perm[pos] = i;
				// i????????£????????§????????°???true
				used[i] = true;
				permutation(pos + 1, n);
				// ?????£????????????????????°?????????
				used[i] = false;
			}
		}
		
		return;
	}
}