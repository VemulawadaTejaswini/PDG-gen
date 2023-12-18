import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MAX = 100000;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
		sc.close();
		int ans=0;
		if(x==2) {
			ans=2;
		} else {
			if(x%2==0) x++;
			for(;;) {
				boolean f=true;
				for(i=3;i*i<=x;i+=2) {
					if(x%i==0) {
						f=false;
						break;
					}
				}
				if(f) {
					ans=x;
					break;
				}
				x+=2;
			}
		}
		out.println(ans);
	}
}
