import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((A-B) >= C) {
			System.out.print(0);
		} else if ((A-B) < C ) {
			System.out.print(C-(A-B));
		}
	}
}