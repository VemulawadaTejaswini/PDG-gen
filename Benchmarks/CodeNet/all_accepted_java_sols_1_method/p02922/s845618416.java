import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		int ans = 0;
		if(b>1) {
			b -= a; 
			ans = 1;
			if(b>0) {
				ans += (int) Math.ceil((double)b / (a-1));
			}
		}
		out.println(ans);
	}
}
