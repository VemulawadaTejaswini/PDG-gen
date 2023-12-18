import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> al = new ArrayList<Integer>();
		String str;

		// Input
		while ((str = br.readLine()) != null) {
			if (str.length() == 0) {
				break;
			}
			al.add(Integer.parseInt(str));
		}

		// PrimeCnt
		int[] cnt = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			cnt[i] = (al.get(i) > 1) ? primeCnt(al.get(i)) : 0;
		}

		// Output
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}

	private static int primeCnt(int no) {
		int cnt = 0;
		for (int i = 2; i <= no; i++) {
			if (primeCheck(i)) {
				cnt++;
			}
		}

		return cnt;
	}

	private static boolean primeCheck(int checkNo) {
		int no = checkNo / 2;
		for (int i = 2; i <= no; i++) {
			if (checkNo % i == 0) {
				return false;
			}
		}
		return true;
	}
}