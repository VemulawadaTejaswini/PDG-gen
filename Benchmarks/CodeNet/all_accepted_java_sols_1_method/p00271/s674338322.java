import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new int[7][7];
		for(int i = 0; i < 7; i++) {
			a[i][0] = stdIn.nextInt();
			a[i][1] = stdIn.nextInt();
		}
		
		int[] ans = new int[7];
		for(int i = 0; i < 7; i++) {
			if(a[i][0] < a[i][1]) {
				ans[i] = a[i][1]-a[i][0];
			}
			else {
				ans[i] = a[i][0]-a[i][1];
			}
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.println(ans[i]);
		}
	}
		
}