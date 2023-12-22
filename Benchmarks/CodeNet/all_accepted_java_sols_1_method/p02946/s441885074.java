import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int from = b-(a-1);
		int to = b+(a-1);
		for (int i = from; i <=to; i++) {
			System.out.print(i+" ");
		}

	}

}
