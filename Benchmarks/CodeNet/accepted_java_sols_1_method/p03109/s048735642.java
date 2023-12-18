import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dateStr = sc.nextLine();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date inputDate = null;
		Date lastHeisei = null;
		try {
			inputDate = sdFormat.parse(dateStr);
			lastHeisei = sdFormat.parse("2019/4/30");
		} catch (ParseException e) {

		}
		if (inputDate.after(lastHeisei)) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}
		sc.close();
	}
}