import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strTime = br.readLine();
		
		int intTime = Integer.parseInt(strTime);
		
		int intHour = intTime / 3600;
		int intMin =  (intTime%3600) / 60;
		int intSec = intTime % 60;
		
		System.out.println(intHour + ":" + intMin + ":" + intSec);
	}
}
