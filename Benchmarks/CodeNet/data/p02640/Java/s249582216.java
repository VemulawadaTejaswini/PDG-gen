import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		for(int i = 0; i <= 100; i++) {
			if(2*i + 4*(x-i) == y) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		
	}

}
