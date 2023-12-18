import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int inputValue = Integer.parseInt(br.readLine());
		String[] inputData = br.readLine().split(" ");
		Integer [] number = new Integer[inputValue];

		for(int i = 0; i < inputData.length; i++){
			number[i] = Integer.parseInt(inputData[i]);
		}

		for(int i = number.length-1; i >= 1; i--){
			sb.append(number[i] + " ");
		}
		sb.append(number[0]);
		System.out.println(sb);
	}

}