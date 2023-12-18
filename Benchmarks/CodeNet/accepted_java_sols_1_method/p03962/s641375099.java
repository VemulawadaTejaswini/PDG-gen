import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int c = sc.nextInt();
		if (h==w&&w==c) {
			System.out.println(1);
		} else if (h==w&&w!=c) {
			System.out.println(2);
		} else if (h!=w&&w==c) {
			System.out.println(2);
		} else if (h==c) {
			System.out.println(2);
		} else  {
			System.out.println(3);
		}
	}
}