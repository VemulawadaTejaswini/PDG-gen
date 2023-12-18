import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] A = new int[n];
		int[] B = new int[n];
		String tmp = scan.nextLine();
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		tmp = scan.nextLine();
		for (int i = 0; i < n; i++) {
			B[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		double tmpRes = 0;
		for (int j = 1; j <= 1000; j++) {
			double res = 0, sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Math.pow(Math.abs((double) A[i] - (double) B[i]), j);
			}
			res = Math.pow(sum, (double) 1 / j);
			if (j <= 3) {
				System.out.println(res);
				tmpRes = res;
				continue;
			}
			if (tmpRes - res < 0.0001) {
				if (Double.isInfinite(res)) {
					System.out.println((double) (int) tmpRes);
				} else {
					System.out.println((double) (int) res);
				}
				return;
			}
			tmpRes = res;
		}
	}
}

