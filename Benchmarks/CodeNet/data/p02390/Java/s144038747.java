import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;

public class b {

	public static void Main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		SimpleDateFormat y = new SimpleDateFormat("s");
		y.setLenient(false);
		try {
			Date d = y.parse(line);
			SimpleDateFormat y2 = new SimpleDateFormat("hh:mm:ss");
			String r = y2.format(d);
			System.out.println(r);

		} catch (ParseException e) {
			// TODO: handle exception
			throw e;
		}

	}
}