import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	static final DateFormat df = SimpleDateFormat.getDateInstance();
	static final Calendar cal = Calendar.getInstance(new Locale("ja", "JP", "JP"));
	static {
		((SimpleDateFormat) df).applyPattern("yyyy MM dd");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			final Date PRE_MAIJI = df.parse("1868 9 8");
			while (in.hasNextLine()) {
				Date date = df.parse(in.nextLine());
				cal.setTime(date);
				if (cal.getTime().before(PRE_MAIJI)) {
					System.out.println("pre-meiji");
				} else {
					int era = cal.get(Calendar.ERA);
					switch (era) {
					case 1:
						System.out.print("meiji ");
						break;
					case 2:
						System.out.print("taisho ");
						break;
					case 3:
						System.out.print("showa ");
						break;
					case 4:
						System.out.print("heisei ");
					default:
						break;
					}
					System.out.print(cal.get(Calendar.YEAR));
					System.out.print(' ');
					System.out.print(cal.get(Calendar.MONTH) + 1);
					System.out.print(' ');
					System.out.println(cal.get(Calendar.DATE));
				}
			}
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}