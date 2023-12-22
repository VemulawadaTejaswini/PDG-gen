import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		long cnt=0;
		long bcnt=0;
		for (i = 0; i < s.length; i++) {
			switch(s[i]) {
			case 'B':
				bcnt++;
				break;
			case 'W':
				cnt+=bcnt;
				break;
			}
		}
		out.println(cnt);
	}
}
