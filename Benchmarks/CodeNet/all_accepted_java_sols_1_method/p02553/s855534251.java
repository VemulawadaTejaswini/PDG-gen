import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		long ac = (long)a*c;
		long ad = (long)a*d;
		long bc = (long)b*c;
		long bd = (long)b*d;

		Optional<Long> max = Arrays.asList(ac,ad,bc,bd).stream().max(Comparator.naturalOrder());

		System.out.println(max.get());

	}
}