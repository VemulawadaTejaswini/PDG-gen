import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		int z = parseInt(sc.next());
		sc.close();
		out.println((x-z)/(y+z));
	}
}
