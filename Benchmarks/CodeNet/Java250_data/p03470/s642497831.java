import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Set<Integer> d = new HashSet<>();

		for(int i=0; i<N; i++)
			d.add(sc.nextInt());

		println(d.size());

	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}