import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "" , all = "";
		boolean Eflag = false;
		while ( sc.hasNext() ) {
			str = sc.next();
			String tmp = "";
			char c;
			for ( int i = 0; i < str.length(); i++ ) {
				c = str.charAt(i);
				if ( c != '.' )
					tmp += str.charAt(i);
				else  Eflag = true;
			}
			if ( tmp.equals("apple"))
				tmp = "peach";
			else if ( tmp.equals("peach") )
				tmp = "apple";
			if ( Eflag == true ) all += tmp+".";
			else all += tmp+" ";
			System.out.println(all);
		}
	}
}