import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		for(int i = 0; i <= 25; i++) {
			for(int j = 0; j <= 14; j++) {
				int t = 4 * i + 7 * j;
				if(t == N) {
					System.out.println("Yes");
					System.exit(0);
				}
				if(t > 100) {
					break;
				}
			}
		}
		System.out.println("No");
	}
}