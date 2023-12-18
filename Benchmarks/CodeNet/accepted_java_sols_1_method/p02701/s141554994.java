import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		Set<String> Ss = new TreeSet<>();
		for(int i = 0; i < N; i++) Ss.add(scanner.nextLine());
		System.out.println(Ss.size());
	}
}
