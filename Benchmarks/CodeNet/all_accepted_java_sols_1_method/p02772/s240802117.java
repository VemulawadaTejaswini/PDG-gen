import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int inCorrectNum = (int) IntStream.range(0, N).map(i -> sc.nextInt()).filter(i -> i % 2 == 0)
				.filter(i -> (i % 3 != 0) && (i % 5 != 0)).count();
		if (inCorrectNum == 0) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}
	}
}
