import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, n;
		List<Integer> member = new ArrayList<Integer>();
		while ((m = in.nextInt()) != 0 && (n = in.nextInt()) != 0) {
			member.clear();
			for (int i = 1; i <= m; i++) {
				member.add(i);
			}
			int imo = -1;
			while (member.size() > 1) {
				imo = (imo + n) % member.size();
				member.remove(imo);
				imo = imo - 1;
			}
			System.out.println(member.get(0));
		}
		in.close();
	}

}