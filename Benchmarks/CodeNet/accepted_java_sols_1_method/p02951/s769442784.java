 import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = 0;


		sum = B + C;
		if((sum-A)<0) {
			System.out.println(0);
		}else {
			System.out.println(sum-A);
		}
	}

}
