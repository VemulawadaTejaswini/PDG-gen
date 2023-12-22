import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int time = A + B;
		if(time > 23) {
			System.out.println(time - 24);
		}else {
			System.out.println(time);
		}

	}
}