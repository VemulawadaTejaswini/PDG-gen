import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int max = h[0];
		boolean flag = true;
		for(int i = 1; i < n; i++) {
			if(h[i] < max-1) {
				flag = false;
				break;
			}
			if(h[i] > max) {
				max =h[i];
			}
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}