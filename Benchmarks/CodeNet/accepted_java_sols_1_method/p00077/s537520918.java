import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, replace, repbe;
		int index;
		char code;
		int num;

		while( scan.hasNext()) {
			// Scan
			str = scan.next();
			index = 0;

			// Replace
			while(true) {
				index = str.indexOf("@",index);
				if(index!=-1) {
					num = str.charAt(index+1) - '0';
					code = str.charAt(index+2);
					repbe = "@" + num + String.valueOf(code);
					replace = "";
					for( int i=0; i<num; i++) replace += String.valueOf(code);
					str = str.replaceFirst(repbe, replace);
				}else break;
			}
			System.out.println(str);
		}
	}
}