import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException{
		while(true){
			int sum = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num = br.readLine();
			int numInt = Integer.parseInt(num);
			if (numInt == 0){
				break;
			}
			for (int i = 0;i < num.length();i++){
				char number = num.charAt(i);
				int numberCal = Character.getNumericValue(number);
				sum += numberCal;
			}
			System.out.println(sum);
		}
	}
}