import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> c = new ArrayList<>();
		
		c.add(a + b);
		c.add(a - b);
		c.add(a * b);

		if(c.get(0) <= c.get(1)) {
			if(c.get(1) <= c.get(2)) {
				System.out.println(c.get(2));
				return;
			} else {
				System.out.println(c.get(1));
				return;
			}
		} else {
			if(c.get(0) <= c.get(2)) {
				System.out.println(c.get(2));
				return;
			} else {
				System.out.println(c.get(0));
				return;
			}
		}
	}
}