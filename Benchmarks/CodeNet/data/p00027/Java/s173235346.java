import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			while(null != (tmpString = bf.readLine())){
				String[] tmp = tmpString.split(" ");
				if(tmp[0].equals("0"))break;
				Calendar cal = Calendar.getInstance();
				cal.set(2004, Integer.parseInt(tmp[0]) - 1, Integer.parseInt(tmp[1]));
				System.out.println(convert(cal));
			}
		} catch (IOException e) {
		}
	}

	private static String convert(Calendar cal){
		String[] week = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int num = cal.get(Calendar.DAY_OF_WEEK);
		return week[num];
	}
}