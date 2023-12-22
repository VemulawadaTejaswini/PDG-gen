import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = n/7;
		for (int i=0;i<=k;i++){
			if ((n-(7*i))%4==0) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}