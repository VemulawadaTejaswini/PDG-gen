import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Long> lList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lList.add(Long.parseLong(sc.next()));
		}
		Collections.sort(lList);

		int result = 0;
		for (int i = 0; i < n - 2 ; i++) {
			long lengthI = lList.get(i);
			for (int j = 1 + i; j < n - 1; j++) {
				long lengthJ = lList.get(j);
				for (int k = 1 + j; k < n; k++) {
					long lengthK = lList.get(k);
					if (lengthI != lengthJ && lengthI != lengthK && lengthJ != lengthK) {
						if (lengthK < (lengthI + lengthJ)) {
							result++;
						}
						
					}
				}
			}
		}
		System.out.println(result);
	}

}
