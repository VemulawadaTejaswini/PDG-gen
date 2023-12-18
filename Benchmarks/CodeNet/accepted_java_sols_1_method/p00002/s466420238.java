import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//?????°?¨????
		String line, output;
		int num1, num2;

		//????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line =br.readLine()) != null) {
			//??????
			String[] numString = line.split(" ", 0);
			//??????
			num1 = Integer.parseInt(numString[0]);
			num2 = Integer.parseInt(numString[1]);
			//?¨????
			num1 = num1 + num2;
			//??????
			output = String.valueOf(num1);
			System.out.println(output.length());
		}
	}

}