import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();

		Double PI = 3.1415926535;

		Double enshu = 2*R*PI;
		
		System.out.println(enshu);
		sc.close();
	}

}
