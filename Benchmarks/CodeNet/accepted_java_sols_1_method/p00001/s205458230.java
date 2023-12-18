import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer[] input = new Integer[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<10; i++){
			input[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(input, Collections.reverseOrder());
		
		for(int i=0; i<3; i++){
			System.out.println(input[i]);
		}
	}
}