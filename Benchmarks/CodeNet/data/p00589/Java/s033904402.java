import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		char[][] c = {{'\'',',','.','!','?'},
					  {'a','b','c','A','B','C'},
					  {'d','e','f','D','E','F'},
					  {'g','h','i','G','H','I'},
					  {'j','k','l','J','K','L'},
					  {'m','n','o','M','N','O'},
					  {'p','q','r','s','P','Q','R','S'},
					  {'t','u','v','T','U','V'},
					  {'w','x','y','z','W','X','Y','Z'}};
					  
		while (sc.hasNext()) {
			String s = sc.next();
			int len = s.length();
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while (i < len) {
				int count = 0;
				while (i+count < len && s.charAt(i) == s.charAt(i+count)) count++;
				if (s.charAt(i) == '0') {
					for (int j = 0; j < count-1; j++)
						sb.append(' ');
				} else {
					int k = Integer.parseInt(""+s.charAt(i))-1;
					sb.append(c[k][(count-1)%c[k].length]);
				}
				i += count;
			}
			out.println(sb);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}