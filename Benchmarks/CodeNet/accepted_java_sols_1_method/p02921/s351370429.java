import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[]s = stdIn.next().toCharArray();
		char[]t = stdIn.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i < 3; i++) {
			if(s[i]==t[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
	}

}
