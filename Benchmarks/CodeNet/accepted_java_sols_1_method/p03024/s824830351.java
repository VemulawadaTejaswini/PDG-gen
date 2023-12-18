import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args){
		int i,win = 0,lose = 0;
		String s = "";
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		for (i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == 'o')	++win;
			else ++lose;
		}
		if(win + (15 - i) >= 8)	out.println("YES");
		else out.println("NO");
		// out.println();
	}
}
