import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n-1];
		for(int i =0;i < n-1;i++) {
			b[i] = sc.nextInt();
		}
		a[0] = b[0];
		long answer = 0;
		for(int i =1; i < n;i++) {
			a[i] = b[i-1];
		}
		for(int i=1;i < n;i++) {
			if(a[i]< a[i-1]) {
				a[i-1] = a[i];
			}
		}

		for(int i =0;i < n;i++) {
			answer += a[i];
		}

		System.out.println(answer);
	}
}