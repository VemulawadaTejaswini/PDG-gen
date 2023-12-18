import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int min = 1001,max = 0,sum = 0;
			for (int i=0;i<n;i++) {
				int s = sc.nextInt();
				if (min > s) {
					min = s;
				}
				if (max < s) {
					max = s;
				}
				sum+=s;
			}
			System.out.println((sum-max-min)/(n-2));
		}
	}
}