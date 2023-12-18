import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		sc.close();
		int[] xy = {0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
		out.println(xy[x]==xy[y]?"Yes":"No");
	}
}
