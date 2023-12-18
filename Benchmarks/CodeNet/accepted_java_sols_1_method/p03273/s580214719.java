
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i < w; i++) {
				boolean white = true;
				for(int j = 0; j < h; j++) {
					if(s[j].charAt(i) != '.') {
						white = false;
						break;
					}
				}
				if(white) {
					for(int j = 0; j < h; j++) {
						s[j] = s[j].substring(0, i) + s[j].substring(i + 1);
					}
					flag = true;
					w--;
					break;
				}
			}
			for(int i = 0; i < h; i++) {
				boolean white = true;
				for(int j = 0; j < w; j++) {
					if(s[i].charAt(j) != '.') {
						white = false;
						break;
					}
				}
				if(white) {
					for(int j = i; j < h - 1; j++) {
						s[j] = s[j + 1];
					}
					flag = true;
					h--;
					break;
				}
			}
		}
		for(int i = 0; i < h; i++) {
			System.out.println(s[i]);
		}
	}

}
