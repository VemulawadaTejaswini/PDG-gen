import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer>  mochi = new HashSet<>();
		
		while (sc.hasNext()) {
			mochi.add(sc.nextInt());
		}
		System.out.println(mochi.size());
	}
}
