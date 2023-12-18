import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int d = parseInt(sc.next());
		int n = parseInt(sc.next());
		sc.close();
		if(n==100)n++;
		out.println((int)pow(100,d)*n);
	}
}
