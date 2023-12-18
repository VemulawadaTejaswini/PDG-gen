import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] O = sc.next().toCharArray();
		char[] E = sc.next().toCharArray();
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		while (true) {
			if (cnt == O.length) break;
			sb.append(O[cnt]);
			if (cnt < E.length) sb.append(E[cnt]);
			cnt++;
		}
		System.out.println(sb.toString());
	}
}
