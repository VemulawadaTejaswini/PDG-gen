
// dictionary

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String[] l = br.readLine().split(" ");
		int n = Integer.parseInt(l[0]);
		int k = Integer.parseInt(l[1]);
		int[] w = new int[n];
		int max = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(br.readLine());
			sum += w[i];
			if (max < w[i]) {
				max = w[i];
			}
		}
		int lower = max - 1, upper = sum;
		while (upper - lower != 1) {
			int middle = (lower + upper) / 2;
			int sumWeight = 0;
			int trackCount = 1;
			for (int i = 0; i < n; i++) {
				if (sumWeight + w[i] > middle) {
					trackCount++;
					sumWeight = w[i];
				} else {
					sumWeight += w[i];
				}
			}
			if (trackCount <= k) {
				upper = middle;
			} else {
				lower = middle;
			}
		}
		System.out.println(upper);
	}
}