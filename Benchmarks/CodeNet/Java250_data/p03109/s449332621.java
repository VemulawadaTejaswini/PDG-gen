import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		SimpleDateFormat data = new SimpleDateFormat("yyyy/MM/dd");
		
		Date date1 = data.parse(S);
		Date date2 = data.parse("2019/4/30");
		
		if(date1.compareTo(date2) <= 0) {
			System.out.println("Heisei");
		}else{
			System.out.println("TBD");
		}
	}
}