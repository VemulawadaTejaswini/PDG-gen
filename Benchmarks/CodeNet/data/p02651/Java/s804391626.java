import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
				List<Long> tempArrayList= new ArrayList<Long>();
				if (S.charAt(j) == '0') {
					for (Long l :setZero) {
						long tempLong = A[j] ^ l;
						tempArrayList.add(tempLong);
					}
					for (Long l :tempArrayList) {
						setZero.add(l);
					}
				} else {
					for (Long l :setOne) {
						long tempLong = A[j] ^ l;
						if (setZero.contains(tempLong) == false) {
							b = true;
							break;
						} else {
							setOne.add(tempLong);
						}
						tempArrayList.add(tempLong);
					}
					if (b==true) {
						for (Long l :tempArrayList) {
							setOne.add(l);
						}
					} else {
						break;
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