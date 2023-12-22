import static java.lang.System.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w == 0) {
				break;
			}
			for(int a = 1; a <= h; a++) {
				for(int b = 1; b <= w; b++) {
					out.print("#");
				}
				out.println();
			}
			out.println();
		}
	}
}
