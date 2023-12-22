import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[][] c = new char[3][];
		c[0] = sc.next().toCharArray();
		c[1] = sc.next().toCharArray();
		c[2] = sc.next().toCharArray();
		sc.close();
		out.print(c[0][0]);
		out.print(c[1][1]);
		out.print(c[2][2]);
		out.println();
	}
}
