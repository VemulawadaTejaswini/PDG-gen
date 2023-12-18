import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		int maxv = Integer.MIN_VALUE;
		int minv = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			int v = sc.nextInt();
			maxv = Math.max(maxv, v - minv);
			minv = Math.min(minv, v);
		}
		
		System.out.println(maxv);
	}
}
