import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		sc.close();
		if(n<1000) out.println("ABC");
		else       out.println("ABD");
	}
}
