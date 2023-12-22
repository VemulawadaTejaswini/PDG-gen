import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if ( (sc.nextInt() + sc.nextInt() + sc.nextInt()) > 21 )
			out.println("bust");
		else 
			out.println("win");
		
	}
}