import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int s = stdIn.nextInt();
			if(x == 0 && y == 0 && s == 0) break;
			int ans = 0;
			for (int i = 1; i < s; i++) {
				for(int j = 1; j < s; j++) {
					int a = (int)i*(100+x)/100;
					int b = (int)j*(100+x)/100;
					if(a + b == s) {
						int c = (int)i*(100+y)/100;
						int d = (int)j*(100+y)/100;
						if(ans < c + d) {
							ans = c + d;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}