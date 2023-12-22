import java.util.Scanner;

public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int[] a = new int[n+5];
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			if (i == a[a[i]]) {
				count++;
				a[a[i]] = 0;
			}
		}
		
		System.out.println(count);
	}
	
}
