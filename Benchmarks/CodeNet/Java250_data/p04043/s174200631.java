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
		int[] a = new int[3];
		a[0] = parseInt(sc.next());
		a[1] = parseInt(sc.next());
		a[2] = parseInt(sc.next());
		sc.close();
		Arrays.parallelSort(a);
		if(a[0]==5&&a[1]==5&&a[2]==7) {
			out.println("YES");
		} else {
			out.println("NO");
		}
	}
}
