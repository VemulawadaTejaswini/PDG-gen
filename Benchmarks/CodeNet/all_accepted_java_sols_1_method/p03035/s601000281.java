import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		if(X>=13) {
			System.out.println(Y);
		}else {
			if(X<=5) {
				System.out.println(0);
			}else {
				System.out.println(Y/2);
			}
		}
	}
}
