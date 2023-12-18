import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		int num = Integer.parseInt(date);
		int a = num / 100;
		int b = num % 100;
		boolean isYYMM = true;
		boolean isMMYY = true;
		if (a < 1 || a > 12)
			isMMYY = false;
		if (b < 1 || b > 12)
			isYYMM = false;
		if (isYYMM && isMMYY)
			out.println("AMBIGUOUS");
		else if (isYYMM && !isMMYY)
			out.println("YYMM");
		else if (!isYYMM && isMMYY)
			out.println("MMYY");
		else
			out.println("NA");
		
	}
}