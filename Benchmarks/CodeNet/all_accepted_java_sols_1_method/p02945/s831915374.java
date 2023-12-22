import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int A = s.nextInt();
			final int B = s.nextInt();

			int max = A + B;
			{
				int work = A - B;
				if(max < work) {
					max = work;
				}
			}
			{
				int work = A * B;
				if(max < work) {
					max = work;
				}
			}
			System.out.println(max);
		}
	}
}
