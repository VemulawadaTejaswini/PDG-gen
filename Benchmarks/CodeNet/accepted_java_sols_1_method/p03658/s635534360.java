import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] sticks = new Integer[n];
		for (int i=0;i<n;i++) {
			int stick=sc.nextInt();
			sticks[i] =stick;
		}
		Arrays.sort(sticks,Collections.reverseOrder());

		int longSnake =0;
		for (int i=0;i<k;i++) {
			longSnake += sticks[i];
		}
		System.out.println(longSnake);
//------------------------------------------------------------
	}
}