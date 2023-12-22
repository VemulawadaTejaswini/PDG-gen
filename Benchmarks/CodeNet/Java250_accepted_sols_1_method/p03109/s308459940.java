import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");


		Date std = sdf.parse("2019/04/30");

		Date date = sdf.parse(s);



		if(date.after(std)) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}


		sc.close();
	}

}
