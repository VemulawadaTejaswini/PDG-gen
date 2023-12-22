import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int sz = s.length();
		String t = "";
		if ( s.charAt(sz-1)=='s' ) {
			t = s.concat("es");
		} else {
			t = s.concat("s");
		}

		System.out.println(t);
	}
}