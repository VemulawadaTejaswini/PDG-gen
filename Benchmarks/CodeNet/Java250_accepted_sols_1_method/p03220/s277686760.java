import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		double ansDiff = 1000000;
		int ansNum = 0;
		for(int i = 0; i < n; i++) {
			double diff = Math.abs(t - h[i] * 0.006 - a);
			if(diff < ansDiff) {
				ansDiff = diff;
				ansNum = i +1;
			}
		}
		System.out.println(ansNum);
	}
}