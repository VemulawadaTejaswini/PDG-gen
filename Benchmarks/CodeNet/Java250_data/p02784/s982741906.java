import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int n = sc.nextInt();
		long dam = 0;
		for (int i = 0; i < n; i++)
			dam += sc.nextLong();
		if (dam >= h)
			out.print("Yes");
		else
			out.print("No");

		
	}
}