import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
		sc.close();
		boolean f=false;
		out.println(c1[0]==c2[2]&&c1[1]==c2[1]&c1[2]==c2[0]?"YES":"NO");
	}
}
