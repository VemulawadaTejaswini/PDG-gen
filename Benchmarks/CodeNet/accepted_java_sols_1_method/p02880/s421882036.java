import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		boolean f=false;
		for(i=1;i<10;i++) {
			if(n%i==0) {
				if(n/i<10) {
					f=true;
					break;
				}
			}
		}
		out.println(f?"Yes":"No");
	}
}
