import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();
		
		if(a+b>=x&&x>=a)System.out.println("YES");
		else System.out.println("NO");
	}

}
