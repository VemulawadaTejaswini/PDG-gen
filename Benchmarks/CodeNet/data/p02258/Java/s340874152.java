import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] R = new int[n];
		for(int i = 0; i < n; i++) {
			R[i] = scan.nextInt();
		}
		scan.close();
		int ans = R[1] - R[0];
		int min = R[0];
		for(int i = 1; i < n; i++) {
			if(min <= R[i]) {
				ans = Math.max(R[i] - min, ans);
			}else {
				min = R[i];
			}
		}
		System.out.println(ans);
	}
}
