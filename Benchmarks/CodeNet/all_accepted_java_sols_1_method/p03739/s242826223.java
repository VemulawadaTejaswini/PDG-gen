import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long plus_op = 0, minus_op = 0; // start with +, -
		long sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(i % 2 == 0 && sum > 0 || i % 2 == 1 && sum < 0) continue;
			if(i % 2 == 0) {
				// + なのに - になってる -> sumを+1にもっていく
				plus_op += (long)Math.abs(1 - sum);
				sum = 1;
			}else {
				// - なのに + になってる -> sumを-1にもっていく
				plus_op += (long)Math.abs(sum + 1);
				sum = -1;
			}
		}

		sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(i % 2 == 0 && sum < 0 || i % 2 == 1 && sum > 0) continue;
			if(i % 2 == 0) {
				// - なのに + になってる -> sumを-1にもっていく
				minus_op += (long)Math.abs(sum + 1);
				sum = -1;
			}else {
				// + なのに - になってる -> sumを+1にもっていく
				minus_op += (long)Math.abs(1 - sum);
				sum = 1;
			}
		}
		System.out.println(Math.min(plus_op, minus_op));
	}
}