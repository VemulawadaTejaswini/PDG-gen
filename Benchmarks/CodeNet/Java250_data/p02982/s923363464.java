import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			List<Integer> xList = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				int xnd = sc.nextInt();
				xList.add(xnd);
			}
			list.add(xList);
		}


		int resultCount = 0;
		for (int i = 0; i < n; i++) {
			List<Integer> xiList = list.get(i);
			for (int l = i; l < n; l++) {
				if(i==l){
					continue;
				}
				List<Integer> xlList = list.get(l);
				int lengthDouble = 0;
				for (int j = 0; j < d; j++) {
					int xi = xiList.get(j);
					int xl = xlList.get(j);
					lengthDouble += (xi-xl) * (xi-xl);
				}
				double length = Math.sqrt(lengthDouble);
				// System.out.println("length "+length);
				// System.out.println("isNumber "+isNumber(length));


				if(isNumber(length)){
					resultCount++;
				}

			}
		}

			System.out.println(resultCount);

	}

	public static boolean isNumber(double val) {
		if ((val == Math.floor(val)) && !Double.isInfinite(val)) {
			return true;
		}
		return false;
	}

}
