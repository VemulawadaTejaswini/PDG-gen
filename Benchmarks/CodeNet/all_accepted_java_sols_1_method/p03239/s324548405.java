import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int cost, time, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			cost = sc.nextInt();
			time = sc.nextInt();
			if (t >= time) {
				min = Math.min(min, cost);
			}
		}
		if (min == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			System.out.println(min);
		}
	}
}
