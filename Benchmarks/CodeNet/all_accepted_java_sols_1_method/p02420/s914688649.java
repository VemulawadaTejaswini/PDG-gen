import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			String W = stdIn.next();
			if(W.equals("-")) {
				break;
			}
			int m = stdIn.nextInt();
			for(int i = 0; i < m; i++) {
				int h = stdIn.nextInt();
				String s1 = W.substring(0, h);
				String s2 = W.substring(h);
				W = s2 + s1;
			}
			System.out.println(W);
		}
	}
}