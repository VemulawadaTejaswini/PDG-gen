import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			sb.append(s).append("\n").append(s).append("\n");
		}
		System.out.print(sb);
	}
}
