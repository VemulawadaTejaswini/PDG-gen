/* Filename: ARC063D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int T = input.nextInt();
			int[] A = new int[N];

			for (int i = 0; i < A.length; ++i) {
				A[i] = input.nextInt();
			}

			int max = Integer.MIN_VALUE;
			int currentMin = A[0];
			for (int i = 1; i < A.length; ++i) {
				max = Math.max(max, A[i] - currentMin);
				currentMin = Math.min(currentMin, A[i]);
			}

			int countMax = 0;
			currentMin = A[0];
			for (int i = 1; i < A.length; ++i) {
				if (A[i] - currentMin == max) {
					++countMax;
				}

				currentMin = Math.min(currentMin, A[i]);
			}

			System.out.println(countMax);
		}
	}

}
