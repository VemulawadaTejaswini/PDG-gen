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
		int w = parseInt(sc.next());
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		int d = 0;
		if(a<b) {
			d = b-(a+w);
		} else {
			d = a-(b+w);
		}
		if(d<0)d=0;
		out.println(d);
	}
}
