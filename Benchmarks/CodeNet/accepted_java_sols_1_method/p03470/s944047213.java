import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList d = new ArrayList();
		for (int i = 0; i < n; i++) {
			int dx = sc.nextInt();
			if (!d.contains(dx)) {
				d.add(dx);
			}
		}
		
		System.out.println(d.size());
	}
}
