import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		int c = parseInt(sc.next());
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		sc.close();
		int mn=(x+y)*Math.max(a, Math.max(b, c));
		int mx=Math.max(x, y);
		int tmp=0; 
		for (i = 0; i <= mx; i++) {
			int tmpx=x-i; 
			int tmpy=y-i;
			tmpx=tmpx<0?0:tmpx;
			tmpy=tmpy<0?0:tmpy;
			tmp=tmpx*a+tmpy*b+i*c*2;
//			out.printf("%d:%d%n", i, tmp);
			if(tmp<mn)mn=tmp;
		}
		out.println(mn);
	}
}