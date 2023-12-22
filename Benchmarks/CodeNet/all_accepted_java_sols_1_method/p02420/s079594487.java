import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			StringBuilder sb = new StringBuilder(sc.next());
			if (sb.toString().equals("-")) {break;}
			else {
				int n = sc.nextInt();
				for (int i=0; i<n; i++) {
					int a = sc.nextInt();
					String s = sb.substring(0,a);
					sb.delete(0,a);
					sb.append(s);
				}
				System.out.println(sb);
			}
		}
	}
}
