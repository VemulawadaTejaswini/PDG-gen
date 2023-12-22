import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i = K-1; i>0 ; i--) {
			if(X-(i) < -1000000) {
				continue;
			}
			System.out.print(X - (i) + " ");
		}
		
		System.out.print(X + " ");
		
		for(int i = 1; i < K ; i++) {
			if(X-(i) > 1000000) {
				continue;
			}
			System.out.print(X + (i) + " ");
		}
		
	}
}