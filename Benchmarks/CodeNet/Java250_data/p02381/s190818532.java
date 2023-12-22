import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scan.nextLine());
			if (n == 0) {
				break;
			}
			String sTmp = scan.nextLine();
			int sum = 0;
			int[] s = new int[n];
 			for (int i = 0; i < n; i++) {
				s[i] = Integer.parseInt(sTmp.split(" ")[i]);
				sum += s[i];
			}
			double ave = (double)sum / (double)n;
			double dv = 0;
			for (int i = 0; i < n; i++) {
				dv += (ave - (double)s[i]) * (ave - (double)s[i]);
			}
			double res = Math.sqrt(dv / n);
			System.out.println(res);
		}
	}

}
