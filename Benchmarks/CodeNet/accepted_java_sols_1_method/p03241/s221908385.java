import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		for(int i = M / N; i > 0; i--) {
			if(M % i == 0) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}
}