import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println(n/(2*n));
		}else {
			System.out.println((n+1)/(2*n));
		}
		sc.close();

	}

}