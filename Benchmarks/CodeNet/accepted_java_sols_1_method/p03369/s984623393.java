import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long count=Arrays.asList((new Scanner(System.in)).nextLine().split(""))
				.stream()
				.filter(s->s.equals("o"))
				.count();
		System.out.println(700+100*count);
	}
}