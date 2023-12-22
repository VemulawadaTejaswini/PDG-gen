import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int d = parseInt(sc.next());
		sc.close();
		out.println((int)ceil((double)n/(2*d+1)));
	}
}
