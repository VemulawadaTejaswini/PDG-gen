import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input_min = sc.nextLong();
		long max = sc.nextLong();
		sc.close();
		int binMax = 0;
		while (max > Math.pow(2, binMax)) {
			binMax++;
		}
		int[] array = new int[binMax + 1];
		long min_xor = 0;
		long min = input_min -1;
		if (min % 2 == 1) {
			long count = (min + 1) / 2;
			if (count % 2 == 1) {
				min_xor = 1;
			}
		} else {
			long count = min / 2;
			if (count % 2 == 1) {
				min_xor = 1;
			}
			long nowi = min;
			int bin = 0;
			while (min >= Math.pow(2, bin)) {
				bin++;
			}
			for (int j = 0; j < bin; j++) {
				if (nowi >= Math.pow(2, bin - j - 1)) {
					array[bin - j - 1]++;
					nowi -= Math.pow(2, bin - j - 1);
				}
			}
		}
		array[0] += min_xor;

		long max_xor = 0;
		if (max % 2 == 1) {
			long count = (max + 1) / 2;
			if (count % 2 == 1) {
				max_xor = 1;
			}
		} else {
			long count = max / 2;
			if (count % 2 == 1) {
				max_xor = 1;
			}
			long nowi = max;
			int bin = 0;
			while (max >= Math.pow(2, bin)) {
				bin++;
			}
			for (int j = 0; j < bin; j++) {
				if (nowi >= Math.pow(2, bin - j - 1)) {
					array[bin - j - 1]++;
					nowi -= Math.pow(2, bin - j - 1);
				}
			}
		}
		array[0] += max_xor;


		long ans = 0;
		for (int k = 0; k < binMax + 1; k++) {
			if (array[k] % 2 == 1) {
				ans += Math.pow(2, k);
			}
		}
		System.out.println(ans);
	}
}