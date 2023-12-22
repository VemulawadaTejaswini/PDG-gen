import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int h = parseInt(sc.next());
		int w = parseInt(sc.next());
		char[][] s = new char[h+2][];
		for (i = 1; i <= h; i++) {
			s[i] = (" "+sc.next()+" ").toCharArray();
		}
		s[0] = new char[w+2];
		s[h+1] = new char[w+2];
		sc.close();
		boolean f=true;
LABEL:	for (i = 1; i <= h; i++) {
			for (j = 1; j <= w; j++) {
				if(s[i][j]=='#') {
					if(s[i-1][j]!='#'&&s[i+1][j]!='#'&&s[i][j-1]!='#'&&s[i][j+1]!='#') {
						f=false;
						break LABEL;
					}
				}
			}
			
		}
		out.println(f?"Yes":"No");
	}
}