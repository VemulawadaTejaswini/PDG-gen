import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan;
		ArrayList<Integer> list = new ArrayList();
		
		int n;
		
		do {
			scan = new Scanner(System.in);
			n = scan.nextInt();
			list.add(n);
		} while (n != 0);
		
		for (int i = 1; i < list.size(); i++) {
			System.out.println("Case " + i + ": " + list.get(i - 1));
		}
	}
}