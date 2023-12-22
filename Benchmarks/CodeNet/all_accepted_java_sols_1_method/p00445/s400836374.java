import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String q = in.next();
			String[] targets = { "JOI", "IOI" };
			for (String target : targets) {
				int posi = q.lastIndexOf(target);
				int count = 0;
				while (posi >= 0) {
					count++;
					posi = q.lastIndexOf(target, --posi);
				}
				System.out.println(count);
			}
		}
	}
}