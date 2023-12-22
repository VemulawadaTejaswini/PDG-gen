import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputData = br.readLine();
		String[] inputValue = inputData.split(" ");

		int a = Integer.parseInt(inputValue[0]);
		int b = Integer.parseInt(inputValue[1]);
		int c = Integer.parseInt(inputValue[2]);

		for(int i = a; i <= b; i ++){
			int divisor = c % i;
			if(divisor == 0){
				count ++;
			}
		}

		System.out.println(count);
	}

}