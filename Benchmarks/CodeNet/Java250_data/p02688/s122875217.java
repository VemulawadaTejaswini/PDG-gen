import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sunuke = Integer.parseInt(sc.next());
		int okasi = Integer.parseInt(sc.next());
		Set<Integer> count = new HashSet();

		for (int i = 0; i < okasi; i++) {
			int okasi2 = Integer.parseInt(sc.next());
			for(int j = 0; j < okasi2; j++) {
				count.add(sc.nextInt());
			}
		}

		System.out.println(sunuke - count.size());

	}


}