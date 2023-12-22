import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		SimpleDateFormat sd = new SimpleDateFormat();
		sd.applyPattern("yyyy/MM/dd");
		Date date = sd.parse(a);
		String b = "2019/04/30";
		Date hikaku = sd.parse(b);
		int ans = date.compareTo(hikaku);
		if (ans == 0  || ans == -1) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
    }
}