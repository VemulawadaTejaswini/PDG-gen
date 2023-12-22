import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (h[j] > h[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
