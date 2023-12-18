import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		if(a >= 3200)
			out.println(s);
		else
			out.println("red");
	}
}