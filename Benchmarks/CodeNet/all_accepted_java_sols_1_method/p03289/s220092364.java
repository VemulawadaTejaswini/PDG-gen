import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) == 'A') {
			int cnt = 0;
			int index = 0;
			for(int j = 2; j < s.length() - 1; j++) {
				if(s.charAt(j) == 'C') {
					cnt++;
					index = j;
				}
			}
			if(cnt == 1) {
				// 大文字が含まれないかどうか
				boolean ok = true;
				for(int i = 1; i < s.length(); i++) {
					if(i == index) continue;
					if(Character.isUpperCase(s.charAt(i))) ok = false;
				}
				if(ok) {
					System.out.println("AC");
					return;
				}
			}
		}
		System.out.println("WA");
	}
}
