
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] B = new int[n-1];
		int ans = 0;
		for(int i = 0; i< n-1; i++) {
			B[i] = sc.nextInt();
		}
		switch(n){
		case 2:
			System.out.println(B[0]*2);
			break;
		default:
			ans = B[0] + B[n-2];
			for(int i = 1; i<=n-2;i++) {
				ans+= Math.min(B[i-1], B[i]);
			}
			System.out.println(ans);
		}
}
}
