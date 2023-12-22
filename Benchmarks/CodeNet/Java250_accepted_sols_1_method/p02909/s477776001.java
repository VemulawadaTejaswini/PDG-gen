import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equals("Sunny"))
			out.println("Cloudy");
		else if (s.equals("Cloudy"))
			out.println("Rainy");
		else
			out.println("Sunny");
		
	}
}