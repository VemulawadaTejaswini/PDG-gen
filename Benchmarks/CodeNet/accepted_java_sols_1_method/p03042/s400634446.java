import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main {
	final static String YYMM = "YYMM";
	final static String MMYY = "MMYY";
	final static String AMBIGUOUS = "AMBIGUOUS";
	final static String NA = "NA";
	final static String patern = "uuMMdd";
	final static String day = "01";
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		boolean yymm = true, mmyy = true;
		try {
			DateTimeFormatter.ofPattern(patern)
			.withResolverStyle(ResolverStyle.STRICT)
			.parse(S + day, LocalDate::from);
		} catch (Exception e) {
			yymm = false;
		}
		try {
			String y = S.substring(2, 4);
			String m = S.substring(0, 2);
			DateTimeFormatter.ofPattern(patern)
			.withResolverStyle(ResolverStyle.STRICT)
			.parse(y + m + day, LocalDate::from);
		} catch (Exception e) {
			mmyy = false;
		}
		if(yymm && mmyy) System.out.println(AMBIGUOUS);
		else if(yymm) System.out.println(YYMM);
		else if(mmyy) System.out.println(MMYY);
		else System.out.println(NA);
	}
}