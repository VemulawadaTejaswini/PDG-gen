import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			long A[] = new long[N];
			for (int j = 0; j < N; j++) {
				A[j] = sc.nextLong();
			}
			String S = sc.next();
			Set<Long> setZero = new HashSet<Long>();
			setZero.add(0l);
			Set<Long> setOne = new HashSet<Long>();
			setOne.add(0l);
			boolean b = false;
			for (int j = N - 1; j >= 0; j--) {
				if (S.charAt(j) == '0') {
					Long[] temp = setZero.toArray(new Long[setZero.size()]);
					for (int k = 0; k < temp.length; k++) {
						long tempLong = A[j] ^ temp[k];
						setZero.add(tempLong);
					}
				} else {
					Long[] temp = setOne.toArray(new Long[setOne.size()]);
					for (int k = 0; k < temp.length; k++) {
						long tempLong = A[j] ^ temp[k];
						if (setZero.contains(tempLong) == false) {
							b = true;
							break;
						} else {
							setOne.add(tempLong);
						}
					}
				}
			}
			if (b == false) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}
}