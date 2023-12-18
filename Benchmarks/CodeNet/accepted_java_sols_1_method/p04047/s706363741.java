import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String nInput = bufferedReader.readLine();
		int n = Integer.parseInt(nInput);
		int numberOfBars = n * 2;
		
		String barsInput = bufferedReader.readLine();
		
		String[] barsStrings = new String[numberOfBars];
		barsStrings = barsInput.split("[\\s]+");
		
		int[] bars = new int[numberOfBars];
		
		for(int i = 0; i < numberOfBars; i++) {
			bars[i] = Integer.parseInt(barsStrings[i]);
		}
		
		Arrays.sort(bars);
		
		int result = 0;
		
		for(int i = 0; i < numberOfBars; i = i + 2) {
			result = result + bars[i];
		}
		
		System.out.println(result);
	}
}