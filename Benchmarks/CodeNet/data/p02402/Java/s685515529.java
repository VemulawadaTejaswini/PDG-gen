import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		int n = Integer.parseInt(reader.readLine()), sum = 0;
		int[] array = new int[n];
		String string = reader.readLine();
		
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(string.split(" ")[i]);
			sum += array[i];
		}
		Arrays.sort(array);
		
		System.out.println(array[0] + " " + array[array.length - 1] + " " + sum);
		
		reader.close();
	}
}