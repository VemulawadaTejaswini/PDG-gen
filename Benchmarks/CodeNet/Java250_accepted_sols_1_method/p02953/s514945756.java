import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] spl = sc.nextLine().split(" ");
		int[] h = new int[N];
		for(int i = 0;i < N;i++) {
			h[i] = Integer.parseInt(spl[i]);
		}
		sc.close();

		String ans = "Yes";
		for(int i = N-1;i > 0;i--) {
			if(h[i] - h[i-1] < 0) {
				h[i-1] -= 1;
				if(h[i] - h[i-1] < 0) {
					ans = "No";
				}
			}
		}
		System.out.println(ans);
	}
}