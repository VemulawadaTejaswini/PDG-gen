import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
public class Main {

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			String a = stdIn.next();
			String b = stdIn.next();
			int aWidth = a.length();
			int bWidth = b.length();
			String pat = "";
			String com = "";
			if(aWidth > bWidth) {
				pat = b;
				com = a;
			} else {
				pat = a;
				com = b;
			}
			a = b = null;
			int ans = 0;
			for(int r = 0; r < pat.length(); r++) {
				String temp = "";
				for(int c = r; c < pat.length(); c++) {
					temp = "";
					for(int k = r; k <= c; k++) {
						temp += pat.charAt(k);
					}
					Pattern p = Pattern.compile(temp);
					Matcher m = p.matcher(com);
					if(m.find()) {
						ans = Math.max(ans, temp.length());
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}