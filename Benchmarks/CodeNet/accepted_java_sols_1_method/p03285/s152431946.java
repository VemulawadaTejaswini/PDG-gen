import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for (int i = 0 ; i <= N / 4 ; i++) {
			for (int j = 0 ; j <= N / 7 ; j++) {
				int ans = i * 4 + j * 7;
				if (ans == N) {
					System.out.print("Yes"); 
					return;
				} else if (ans > N) {
					break;
				}
			}
		}
		System.out.print("No"); 
	}
}
