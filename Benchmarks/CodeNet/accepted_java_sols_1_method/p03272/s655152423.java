import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int i = parseInt(sc.next());
		sc.close();
		out.println(n-i+1);
	}
}
