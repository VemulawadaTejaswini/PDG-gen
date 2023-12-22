import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int H = Integer.parseInt(sc.next());
			int W = Integer.parseInt(sc.next());
			if (H == 0 && W == 0) break;
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<H; i++) {
				for (int j=0; j<W; j++) {
					sb.append('#');
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
		sc.close();
	}
}