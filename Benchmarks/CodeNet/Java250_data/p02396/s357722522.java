import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num;
		int i = 0;
		while(true) {
			num = in.nextInt();
			if (num == 0) {
				break;
			} else {
				sb.append("Case " + (++i) + ": " + num + "\n");
			}
		}
		
		System.out.print(sb);
	}
}