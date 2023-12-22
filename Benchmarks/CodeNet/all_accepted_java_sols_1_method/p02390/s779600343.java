import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		try {
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null){
				int hour = Integer.parseInt(line)/(60*60);
				int minutes = (Integer.parseInt(line)%(60*60))/60;
				int second = (Integer.parseInt(line)%(60*60))%60;
				System.out.println(hour+":"+minutes+":"+second);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}