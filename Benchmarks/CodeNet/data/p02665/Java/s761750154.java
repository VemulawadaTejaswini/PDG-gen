

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long n = sc.nextLong();
			stringList.add(n);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> treeList = getStrings(sc, n+1);
		long[] treeArray = new long[n+1];
		if (n == 0) {
			if (treeList.get(0) == 1) {
				System.out.println(1);
			} else {
				System.out.println(-1);
			}
			return;
		}
		treeArray[n] = treeList.get(n);
		for (int i = n-1; i >= 0; i--) {
			long max = (long)Math.pow(2.0, i);
			if (treeList.get(i) > max) {
				System.out.println(-1);
				return;
			}
			long tobeRoot = max - treeList.get(i);
			if (tobeRoot <=0) {
				System.out.println(-1);
				return;
			}
			long uppermax = 1;
			if (i != 0) {
				long upper = (long)Math.pow(2.0, i-1) - treeList.get(i-1);
				uppermax = upper*2;
			}
			treeArray[i] = Math.min(Math.min(treeArray[i+1] + treeList.get(i), max), uppermax);
		}
		for (int i = 1; i <= n; i++) {
			treeArray[i] = Math.min(treeArray[i], (treeArray[i-1]-treeList.get(i-1))*2);
		}
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			sum+=treeArray[i];
			// comment out
//			System.out.print(treeArray[i] + ", " + Math.pow(2, i));
//			System.out.println();
		}
		System.out.println(sum);
	}

}

