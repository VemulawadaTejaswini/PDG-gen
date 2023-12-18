import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Date date1 = new Date(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
		Date date2 = new Date(2019, 4, 30);
		if(date1.after(date2)) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}
	}
}
