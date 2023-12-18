import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		ArrayDeque<Integer> stack = new ArrayDeque<>();

		while ( sc.hasNext() ) {
			int n = sc.nextInt();
			switch (n) {
			case 0:
				System.out.println( stack.pop() );
				break;
			default:
				stack.push(n);
				break;
			}
		}
	}

}