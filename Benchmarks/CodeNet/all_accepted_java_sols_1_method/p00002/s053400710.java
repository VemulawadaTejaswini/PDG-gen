import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0002_DigitNumber {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				try {
					String[] data = line.split(" ");
					int[] numbers = new int[2];
					for(int i = 0; i < 2; i++) {
						numbers[i] = Integer.parseInt(data[i]);
					}
					int sum = numbers[0] + numbers[1];
					int result = 0;
					while(sum > 0) {
						sum = sum / 10;
						result++;
					}
					System.out.println(result);
				} catch(NumberFormatException e) {
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}