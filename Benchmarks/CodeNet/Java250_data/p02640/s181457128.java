import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for(int i=0;i<=x;i++) {
			int turu = x - i;
			if(2 * turu + 4 * i == y) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");

	}

}
