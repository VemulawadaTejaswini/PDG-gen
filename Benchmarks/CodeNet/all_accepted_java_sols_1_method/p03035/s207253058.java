import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < 6)
			out.println(0);
		else if (a < 13)
			out.println(b / 2);
		else
			out.println(b);
	}
}