import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		int ff = sc.nextInt();
		int maxSugar = 0;
		int maxWater = 0;
		double max = -1;
		for (int a = 0; 100 * a * aa <= ff; a++) {
		    for (int b = 0; 100 * (a * aa + b * bb) <= ff; b++) {
		        for (int c = 0; 100 * (a * aa + b * bb) + c * cc <= ff && (a * aa + b * bb) * ee >= c * cc; c++) {
		            for (int d = 0; 100 * (a * aa + b * bb) + c * cc + d * dd <= ff && (a * aa + b * bb) * ee >= c * cc + d * dd; d++) {
		                int sugar = c * cc + d * dd;
		                int water = 100 * (a * aa + b * bb);
		                if (max < (double)sugar / (sugar + water)) {
		                    max = (double)sugar / (sugar + water);
		                    maxSugar = sugar;
		                    maxWater = water;
		                }
		            }
		        }
		    }
		}
        System.out.println((maxSugar + maxWater) + " " + maxSugar);
	}
}
