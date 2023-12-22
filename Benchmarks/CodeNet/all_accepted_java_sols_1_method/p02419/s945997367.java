
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strCheck = sc.nextLine();

		Pattern p = Pattern.compile(strCheck, Pattern.CASE_INSENSITIVE);


		int Count = 0;
		while(sc.hasNext()) {

			String strS = sc.next();
			Matcher m = p.matcher(strS);

			if(m.matches()) {
				//System.out.println("????????????????????????");
				Count++;
			}
			if(strS.equals("END_OF_TEXT")) {
				//System.out.println("??????????????????");
				break;
			}
		}
		System.out.println(Count);
	}
}