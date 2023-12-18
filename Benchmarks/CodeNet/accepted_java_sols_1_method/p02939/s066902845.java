import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();		
		int cnt = 0;
		String prev = "";
		String now = "";
		for ( int i = 0; i < s.length; i++ ) {
			now += s[i];
			if( !prev.equals(now)) {
				cnt++;
				prev = now;
				now = "";
			}			
		}
		System.out.println(cnt);
		in.close();
	}
}