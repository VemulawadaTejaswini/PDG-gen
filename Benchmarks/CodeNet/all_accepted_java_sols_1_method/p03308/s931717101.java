import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<n; i++) {
			int val = scan.nextInt();
			if (val>max) {
				max=val;
			}
			if (val<min) {
				min=val;
			}
		}
		System.out.println(max-min);
		scan.close();
	}
}