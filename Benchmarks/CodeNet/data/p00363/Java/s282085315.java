import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		char c = sc.next().charAt(0);
		StringBuilder sb = new StringBuilder();
		sb.append("+");
		for(int i = 0; i < w-2; i++) {
			sb.append("-");
		}
		sb.append("+\n");
		for(int y = 1; y < h-1; y++) {
			sb.append("|");
			for(int x = 1; x < w-1; x++) {
				if(y==h/2 && x==w/2) {
					sb.append(c);
				} else {
					sb.append(".");
				}
			}
			sb.append("|\n");
		}
		sb.append("+");
		for(int i = 0; i < w-2; i++) {
			sb.append("-");
		}
		sb.append("+");

		System.out.println(sb);
	}
}
