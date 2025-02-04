/* Filename: ABC043C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] a = new int[N];
			
			int sumA = 0;
			for(int i = 0; i < a.length; ++i){
				a[i] = input.nextInt();
				sumA += a[i];
			}
			
			int avgA = (int)Math.round(sumA / (double)N);
			int cost = 0;
			
			for(int i = 0; i < a.length; ++i){
				cost += (avgA - a[i]) * (avgA - a[i]);
			}
			
			System.out.println(cost);
		}
	}

}
