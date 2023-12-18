import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int AllA = s.nextInt() * N;
			final int B = s.nextInt();

			if(AllA < B) {
				System.out.println(AllA);
			} else {
				System.out.println(B);
			}
		}
	}
}
