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
				boolean flg = true;
				for(int b = 1; b <= w; b++) {
					if(a % 2 == 1) {
						if(flg) {
							out.print("#");
						}else {
							out.print(".");
						}
						flg = !flg;
					}else {
						if(flg) {
							out.print(".");
						}else {
							out.print("#");
						}
						flg = !flg;
					}
				}
				out.println();
			}
			out.println();
		}
	}
}
