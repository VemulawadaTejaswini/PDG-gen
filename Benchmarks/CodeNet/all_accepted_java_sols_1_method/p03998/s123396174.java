import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[][] s = new char[3][];
		s[0] = sc.next().toCharArray();
		s[1] = sc.next().toCharArray();
		s[2] = sc.next().toCharArray();
		sc.close();
		int[] sp = new int[3]; 
		int abc = 0;
		int tmp = 0;
		while(sp[abc] != s[abc].length) {
			tmp = (int)(s[abc][sp[abc]] - 'a');
			sp[abc]++;
			abc=tmp;
		}
		out.println((char)('A'+abc));
	}
}
