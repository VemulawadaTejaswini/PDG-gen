import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A =Integer.parseInt(sc.next());
		long B =Integer.parseInt(sc.next());
		long C =Integer.parseInt(sc.next());

		if(A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		}else {
			long min = Math.min(A * B, B * C);
			min = Math.min(min, C * A);
			System.out.println(min);
		}
	}

}
