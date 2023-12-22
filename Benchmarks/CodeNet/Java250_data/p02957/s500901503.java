import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		if ((A + B) % 2 ==0) {
			System.out.print((A+B)/2);

		}else {
			System.out.print("IMPOSSIBLE");
		}

	}

}