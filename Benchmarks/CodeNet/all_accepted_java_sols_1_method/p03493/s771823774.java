import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long count=Arrays.asList((new Scanner(System.in)).nextLine().split(""))
				.stream()
				.filter(s->s.equals("1"))
				.count();
		System.out.println(count);

	}

}
