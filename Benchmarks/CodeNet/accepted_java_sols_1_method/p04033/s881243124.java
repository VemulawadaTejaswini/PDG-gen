
import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int aa;
		int bb;

		if (a > 0) {
			aa = 1;
		} else if (a == 0) {
			aa = 0;
		} else {
			aa = -1;
		}
		if (b > 0) {
			bb = 1;
		} else if (b == 0) {
			bb = 0;
		} else {
			bb = -1;
		}
		if (aa == 1 && bb == 1) {
			System.out.println("Positive");
		} else if (aa == -1 && bb == 1) {
			System.out.println("Zero");
		} else if (aa == 0 || bb == 0) {
			System.out.println("Zero");
		} else if (aa == -1 || bb == -1) {
			if(Math.abs(b-a) % 2 == 0){
				System.out.println("Negative");
			}else{
				System.out.println("Positive");
			}
		}
		in.close();

	}

}