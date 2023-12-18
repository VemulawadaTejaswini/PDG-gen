import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			String name = sc.next();
			int am = sc.nextInt();
			int pm = sc.nextInt();
			
			System.out.println(name + " " + (am + pm) + " " + (am * 200 + pm * 300));
		}
	}
}