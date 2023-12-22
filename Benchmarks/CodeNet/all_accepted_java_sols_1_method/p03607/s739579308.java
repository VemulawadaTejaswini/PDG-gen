import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		Set<Integer> set = new HashSet<>();

		IntStream.range(0, n).forEach(i -> {int a = Integer.parseInt(sc.next());
											if (!set.add(a)) set.remove(a);}
									 );

		System.out.println(set.size());

		sc.close();
	}
}