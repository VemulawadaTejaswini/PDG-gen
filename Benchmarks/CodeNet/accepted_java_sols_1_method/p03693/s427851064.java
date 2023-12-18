import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int r = parseInt(sc.next());
		int g = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		out.println((r*100+g*10+b)%4==0?"YES":"NO");
	}
}
