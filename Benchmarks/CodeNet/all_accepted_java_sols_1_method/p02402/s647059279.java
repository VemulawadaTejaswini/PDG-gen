import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		long sum = 0;
		for(int i = 0; i < n; i++) {
			int t = scan.nextInt();
			sum += (long)t;
			if(t < min) {
				min = t;
			}
			if(t > max) {
				max = t;
			}
		}
		scan.close();
		System.out.println(min + " " + max + " "+ sum);
	}
}
