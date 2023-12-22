import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double d = sc.nextInt();
		double t = sc.nextInt();
		double s = sc.nextInt();

		if(d/s > t) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}