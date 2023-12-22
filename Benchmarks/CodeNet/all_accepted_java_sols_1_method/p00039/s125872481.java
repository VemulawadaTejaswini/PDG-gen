import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(sc.hasNext()) {
			String line = sc.nextLine();
			int ans = 0;
			int prev = 0;
			for(int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				int p = 0;
				if(c == 'I') p = 1;
				else if(c == 'V') p = 5;
				else if(c == 'X') p = 10;
				else if(c == 'L') p = 50;
				else if(c == 'C') p = 100;
				else if(c == 'D') p = 500;
				else if(c == 'M') p = 1000;
				else {
					System.out.println("error");
				}
				if(prev < p) ans += p - prev * 2;
				else ans += p;
				prev = p;
			}
			System.out.println(ans);
		}
	}
}