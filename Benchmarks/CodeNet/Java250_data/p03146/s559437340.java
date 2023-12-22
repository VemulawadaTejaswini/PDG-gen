
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		boolean count = true;
		ArrayList<Integer> a = new ArrayList<>();
		a.add(s);
		int i = 1;

		while (count) {
			i++;
			if (s % 2 == 0) {
				s /= 2;
			} else {
				s = s * 3 + 1;
			}
			if (a.contains(s)) {
				System.out.println(i);
				break;
			}
			a.add(s);
		}

		sc.close();
	}
}
