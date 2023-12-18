import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		sc.close();
		out.println((b-a)%2==0?(b-a)/2:Math.min((a+b-1)/2,(2*n-a-b+1)/2));
	}
}
