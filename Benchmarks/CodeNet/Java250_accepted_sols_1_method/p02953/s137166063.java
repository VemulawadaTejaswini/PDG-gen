import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		boolean flag = true;

		for(int i = 0; i < n; i++) h[i] = sc.nextInt();

		h[0]--;
		for(int i = 1; i < n; i++) {
			if(h[i-1] < h[i]) {
				h[i]--;
			}else if(h[i-1] > h[i]) {
				flag = false;
				break;
			}
		}

		System.out.print(flag ? "Yes" : "No");
		sc.close();
	}
}