import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HashMap<String,Boolean> a = new HashMap<String,Boolean>();
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			a.put(stdIn.next(), true);
		}
		int m = stdIn.nextInt();
		boolean c = true;
		for(int i = 0; i < m; i++) {
			String b = stdIn.next();
			if(!a.containsKey(b)) {
				System.out.println("Unknown " + b);
			}
			else {
				if(c) {
					System.out.println("Opened by " + b);
					c = false;
				}
				else {
					System.out.println("Closed by " + b);
					c = true;
				}
			}
		}
	}
}