import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A,B;
		A=scan.nextInt();
		B=scan.nextInt();
		for(int C = 1; C<=3;C++) {
			if((A*B*C)%2!=0) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");

	}

}
