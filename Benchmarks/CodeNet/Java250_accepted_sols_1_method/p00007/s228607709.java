import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0007_DebtHell {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			while((line = reader.readLine()) != null) {
				int month = Integer.parseInt(line);
				
				int debt = 100;
				for(int i = 0; i < month; i++) {
					debt = (int)Math.ceil(debt * 1.05);
				}
				System.out.println(debt * 1000);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}