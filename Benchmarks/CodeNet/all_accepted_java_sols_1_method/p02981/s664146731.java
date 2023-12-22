import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		System.out.println(Math.min(n*a,b));
	}
}
