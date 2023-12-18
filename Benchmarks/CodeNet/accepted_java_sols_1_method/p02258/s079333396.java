import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] r = new long[n];
		for (int i = 0; i < r.length; i++) {
			r[i] = sc.nextInt();
		}
		long max = -1000000000;
		long min;
		min = r[0];
		for (int i = 1; i < r.length; i++) {
			if(max < r[i] - min){
				max = r[i] - min;
			}
			if(min > r[i]){
				min = r[i];
			}
		}
		System.out.println(max);
	}
}
