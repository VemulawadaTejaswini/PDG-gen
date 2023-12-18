

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			// input
			char[] firstInput = br.readLine().toCharArray(); // ex : 123
			int[] num = new int[firstInput.length];// base
			for (int i = 0; i < firstInput.length; i++) {
				char seconInput = 0;
				seconInput = firstInput[i];//split
				num[i] = Character.getNumericValue(seconInput);// input info
			} // clear


			// plus works & output
			int sum = 0;
			for (int i = 0; i < num.length; i++) { // error
				// constraints
				if (num[i] == 0) {
					break;
				} else {
					sum += num[i];
				}
			}
			System.out.println(sum); //error
		}
	}
}