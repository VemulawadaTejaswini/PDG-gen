import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		char c, d;
		boolean flg;
		int count=0;
		
		while( scan.hasNext()) {
			str = scan.next();

			flg = false;
			for( int i=0; i<(str.length()/2); i++) {
				c = str.charAt(i);
				d = str.charAt(str.length()-1-i);
				if(c!=d) {flg = true; break;}
				
			}
			if(!flg) count++;
		}
		scan.close();
		System.out.println(count);
	}

}