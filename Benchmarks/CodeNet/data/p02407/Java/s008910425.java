import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

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

		Arrays.sort(number, Comparator.reverseOrder());

		for(int i = 0; i < number.length-1; i++){
			sb.append(number[i] + " ");
		}
		sb.append(number[number.length-1]);
		System.out.println(sb);
	}

}