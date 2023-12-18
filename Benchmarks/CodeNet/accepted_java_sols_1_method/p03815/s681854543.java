import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		long i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		sc.close();
		long a=(x/11)*2;
		long mod=x%11;
		if(mod>0 && mod<=6) {
			a+=1;
		} else if(mod>6){
			a+=2;
		}
		out.println(a);
	}
}
