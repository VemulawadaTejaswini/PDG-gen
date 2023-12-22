import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int count = 1;
		int max = h[0];
		for (int i = 1; i < n; i++) {
			if (h[i] >= max) {
				max = h[i];
				count++;
			}
		}
		System.out.println(count);
	}
}