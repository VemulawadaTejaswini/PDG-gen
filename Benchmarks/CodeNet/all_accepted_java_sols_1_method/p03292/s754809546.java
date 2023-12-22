import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		int[] a = new int[3];
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		out.println((a[1]-a[0])+(a[2]-a[1]));
	}
}
