import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int l = sc.nextInt();
			
			int result = 0;
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = l + i;
				result += a[i];
			}
			
			int temp = Integer.MAX_VALUE;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (Math.abs(a[i]) < temp) {
					temp = Math.abs(a[i]);
					ans = result - a[i];
				}
			}
			
			System.out.println(ans);
			

		}

	}
	
}
