import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		System.out.println(hs.size());
	}
}