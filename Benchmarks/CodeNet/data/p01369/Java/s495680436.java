
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	String r = "yuiophjklnm";
	
	boolean find(char c) {
		for(int i=0;i<r.length();i++)
			if(r.charAt(i) == c) return true;
		return false;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String str = sc.next();
			if(str.equals("#")) break;
			int cnt=0;
			for(int i=0;i<str.length()-1;i++)
				cnt += find(str.charAt(i))^find(str.charAt(i+1))? 1:0;
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}