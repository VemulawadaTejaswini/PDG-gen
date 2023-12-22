import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int t = scanner.nextInt();
		
		int ans = x-t;
		if (ans<0) {
			ans=0;
		}
		System.out.println(ans);
		scanner.close();
	}

}