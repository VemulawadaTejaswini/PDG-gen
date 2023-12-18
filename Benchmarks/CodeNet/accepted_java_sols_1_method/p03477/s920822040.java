import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lw = sc.nextInt() + sc.nextInt();
		int rw = sc.nextInt() + sc.nextInt();

		if(lw > rw) {
			System.out.println("Left");
		} else if(lw < rw) {
			System.out.println("Right");
		} else {
			System.out.println("Balanced");
		}
	}
}