import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date baseDate = sdf.parse("2019/04/30");
		try(Scanner sc = new Scanner(System.in)){
				String ret = baseDate.compareTo(sdf.parse(sc.nextLine())) == -1 ? "TBD" : "Heisei";
				System.out.println(ret);
			}
		}	
}
