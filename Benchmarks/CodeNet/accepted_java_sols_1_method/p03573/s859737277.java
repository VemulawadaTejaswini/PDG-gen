import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int ans = a;
		
		if (a==b) {
			ans=c;
		}else if (a==c) {
			ans=b;
		}
		
		System.out.println(ans);
		
		scanner.close();
	}

}
