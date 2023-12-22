import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R')cnt++;
		}
		
		if(cnt == 2) {
			if(s.charAt(1) == 'S') {
				cnt = 1;
			}
		}
		System.out.println(cnt);
		
	}

}
