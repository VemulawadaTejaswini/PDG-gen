import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = (int) -Math.pow(10, 9);
		int min = scan.nextInt();

		for (int i = 0; i < n - 1; i++) {
			int r = scan.nextInt();
			max = Math.max(max, r - min);
			min = Math.min(min, r);
		}
		System.out.println(max);	
	}
}
