import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(n * (1 + n % 2));
	}
}