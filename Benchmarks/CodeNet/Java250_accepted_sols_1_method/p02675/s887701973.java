import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		String ans="";
		switch(n%10) {
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			ans="hon";
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			ans="pon";
			break;
		case 3:
			ans="bon";
			break;
		}
		out.println(ans);
	}
}
