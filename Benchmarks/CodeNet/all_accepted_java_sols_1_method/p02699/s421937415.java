import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int s, w;
		Scanner scan = new Scanner(System.in);

		s = scan.nextInt();
		w = scan.nextInt();

		if(s > w) {
			System.out.println("safe");
		} else {
			System.out.println("unsafe");
		}
	}

}
