import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		
		for (int i=0; i<26; i++) {
			StringBuilder sb = new StringBuilder();
			char c;
			
			for (int j=0; j<s.length(); j++) {
				c = s.charAt(j);
				if (c!='.' && c!=' ') {
					c -= i;
					if (c < 97) {c+=26;}
				}
				sb.append(c);
			}
			
			 if(sb.indexOf("the")!=-1
	                    || sb.indexOf("this")!=-1
	                    || sb.indexOf("that")!=-1) {
				 out.println(sb); break;
			 }
//			if (sb.toString().matches(".*(the|this|that).*")) {}
		}
	}
}
