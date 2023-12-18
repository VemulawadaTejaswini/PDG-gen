import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int tap = 0;
		int socket = 1;

		while(socket < B) {
			socket = socket + A - 1;
			tap ++;
		}

		System.out.println(tap);

	}
}