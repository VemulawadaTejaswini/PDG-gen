import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		Calendar xc = Calendar.getInstance();
        xc.set(Calendar.YEAR, 2018);
        xc.set(Calendar.MONTH, x - 1);
        Calendar yc = Calendar.getInstance();
        yc.set(Calendar.YEAR, 2018);
        yc.set(Calendar.MONTH, y - 1);
        if (xc.getActualMaximum(Calendar.DAY_OF_MONTH) == yc.getActualMaximum(Calendar.DAY_OF_MONTH))
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}
}