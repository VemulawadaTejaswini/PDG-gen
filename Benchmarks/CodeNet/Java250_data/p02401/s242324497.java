import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int answer = 0;
		int flag = 0;


		while(flag != 1){
			String inputData = br.readLine();
			String[] inputValue = inputData.split(" ");

			int a = Integer.parseInt(inputValue[0]);
			int b = Integer.parseInt(inputValue[2]);

			String operator = inputValue[1];
			switch(operator){
				case "+":
					answer = a + b;
					System.out.println(answer);
					break;

				case "-":
					answer = a - b;
					System.out.println(answer);
					break;

				case "*":
					answer = a * b;
					System.out.println(answer);
					break;

				case "/":
					answer = a / b;
					System.out.println(answer);
					break;

				case "?":
					flag ++;
					break;
			}



		}
	}

}