import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count = 0;
		Set<Integer> number = new HashSet<Integer>();
		while (count < len) {
			number.add(sc.nextInt());
			count++;
		}
		if (number.size() == len) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
