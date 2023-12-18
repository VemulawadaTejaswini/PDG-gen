import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = (int) IntStream.rangeClosed(1, n).filter(i -> String.valueOf(i).length() % 2 != 0).count();
		//IntStream.rangeClosed(1, n).filter(i -> String.valueOf(i).length() % 2 != 0).forEach(System.out::println);
		System.out.println(ans);
	}

}
