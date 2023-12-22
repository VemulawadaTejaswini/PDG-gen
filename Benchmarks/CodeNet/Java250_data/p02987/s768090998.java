import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void a() {
		String s = sc.next();
		char c1 = s.charAt(0),c2 = 0;
		int c1cnt = 1,c2cnt = 0;
		for(int i = 1;i < s.length();i ++) {
			char c = s.charAt(i);
			if(c == c1) c1cnt++;
			else if(c != c2) {
				c2cnt = 1;
				c2 = c;
			}
			else if(c == c2) c2cnt++;
		}
		if(c1cnt == 2 && c2cnt == 2) System.out.println("Yes");
		else System.out.println("No");
	}
	public static void main(String[] args) {
		new Main().a();
	}

}



