import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k,l;
		Scanner sc = new Scanner(in);
		long h = parseLong(sc.next());
		sc.close();
		long ans = (long)pow(2,(long)floor(log(h)/log(2))+1)-1;
		out.println(ans);
	}
}
