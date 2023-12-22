import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int minTaste = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int taste = L + i;
          	int x = Math.abs(taste);
			sum += taste;
			if (min > x) {
				min = x;
				minTaste = taste;
			}
		}
		System.out.println(sum - minTaste);
	}
}