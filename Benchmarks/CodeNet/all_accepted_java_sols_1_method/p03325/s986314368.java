import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		loop : while(true) {
			for(int i = 0; i < n; i++) {
				if(a[i]%2 == 0) {
					a[i] = a[i] / 2;
					count++;
					break;
				}
				if(i == n - 1) {
					break loop;
				}
			}
		}
		System.out.println(count);
	}
}