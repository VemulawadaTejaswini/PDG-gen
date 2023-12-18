import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] x = new int[n + 1];
		x[0] = Math.abs(a[0]);
		x[n] = Math.abs(a[n - 1]);
		for(int i = 1 ; i < n ; i++) x[i] = Math.abs(a[i] - a[i - 1]);
		int sum = 0;
		for(int i = 0 ; i < n + 1 ; i++) sum += x[i];
		for(int i = 0 ; i < n ; i++) {
			int temp = sum;
			temp -= x[i] + x[i + 1];
			if(i == 0) {
				temp += Math.abs(a[1]);
			} else if(i == n - 1) {
				temp += Math.abs(a[n - 2]);
			} else {
				temp += Math.abs(a[i - 1] - a[i + 1]);
			}
			System.out.println(temp);
		}
	}
}
