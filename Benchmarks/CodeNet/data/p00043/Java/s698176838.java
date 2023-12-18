import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in;
		try {
			while ((in = sc.nextLine()) != null) {
				ArrayList<Integer> ans = new ArrayList<Integer>();
				for (int i = 1; i <= 9; i++) {
					String temp = new String(in) + i;
					if (solve(temp)) {
						ans.add(i);
					}
				}
				if (ans.size() == 0) {
					System.out.println(0);
				} else {
					Collections.sort(ans);
					for (int i = 0; i < ans.size() - 1; i++) {
						System.out.print(ans.get(i) + " ");
					}
					System.out.println(ans.get(ans.size() - 1));
				}
			}
		} catch (Exception e) {
		}
	}

	static int[] toArray(String str) {
		int ret[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		for (char num : str.toCharArray()) {
			ret[num - '0' - 1]++;
		}
		for (int n : ret) {
			if (n > 4)
				return null;
		}
		return ret;
	}

	static boolean solve(String in) {
		for (int i = 0; i < 9; i++) {
			int temp1[] = toArray(in);
			if (temp1 == null) {
				return false;
			}
			if (head(temp1, i)) {
				int[] temp2 = temp1.clone();
				if (solve2(temp2, 0)) {
					return true;
				}
			}
		}

		return false;
	}

	static boolean solve2(int[] in, int dep) {
		for (int i = 0; i < 9; i++) {
			int[] temp = in.clone();
			if (kotu(temp, i)) {
				if (hantei(temp)) {
					return true;
				}
				if (dep < 4) {
					if (solve2(temp, dep + 1)) {
						return true;
					}
				}
			}
		}
		for (int i = 0; i < 7; i++) {
			int[] temp = in.clone();
			if (shuntu(temp, i)) {
				if (hantei(temp)) {
					return true;
				}
				if (dep < 4) {
					if (solve2(temp, dep + 1)) {
						return true;
					}
				}
			}
		}

		return false;
	}

	// 頭をとる。取れたらｔるえ
	static boolean head(int in[], int num) {
		if (in[num] >= 2) {
			in[num] -= 2;
			return true;
		} else {
			return false;
		}
	}

	// こーつをとる。取れたらｔるえ
	static boolean kotu(int in[], int num) {
		if (in[num] >= 3) {
			in[num] -= 3;
			return true;
		} else {
			return false;
		}
	}

	// しゅんつをとる。取れたらｔるえ
	static boolean shuntu(int in[], int num) {
		if (num > 7) {
			return false;
		} else {
			if (in[num] >= 1 && in[num + 1] >= 1 && in[num + 2] >= 1) {
				in[num]--;
				in[num + 1]--;
				in[num + 2]--;
				return true;
			} else {
				return false;
			}
		}
	}

	static boolean hantei(int[] in) {
		for (int n : in) {
			if (n != 0)
				return false;
		}
		return true;
	}
}