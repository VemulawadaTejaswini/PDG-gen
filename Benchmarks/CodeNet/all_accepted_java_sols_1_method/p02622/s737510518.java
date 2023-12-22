import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		int g = 0;
		for ( int i=0; i<s.length(); i++ ) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			if ( s1!=t1 ) g++;
		}


		System.out.println(g);
	}
}