import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0) {
				break;
			}
			
			long[][] lArray = new long[n][3];
			for (int i = 0; i < n; i++) {
				lArray[i] = convertLong(sc.nextLine().split(" "));
			}
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n; j++) {
					if (i != j && lArray[i][0] == lArray[j][0]) {
						lArray[i][1] = lArray[i][1] + lArray[j][1];
						lArray[i][2] = lArray[i][2] + lArray[j][2];
						lArray[j][0] = 0;
					}
				}
			}
			boolean nothingFlg = true;
			for (long[] a : lArray) {
				if (a[0] != 0 && (a[1] * a[2]) >= 1000000) {
					System.out.println(a[0]);
					nothingFlg = false;
				}
			}
			if (nothingFlg) {
				System.out.println("NA");
			} 
		}
	}

	private static long[] convertLong(String[] str) {
		long[] array = new long[str.length];
		for (int i = 0; i < str.length; i++) {
			array[i] = Long.parseLong(str[i]);
		}
		return array;
	}
}