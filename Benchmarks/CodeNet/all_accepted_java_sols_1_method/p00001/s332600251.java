import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	private static int[] data = new int[10];

	public static void main(String args[]) {
		

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			for(int i=0; i<10; i++) {
				
				String s = input.readLine();
				
				data[i] = Integer.parseInt(s);
			}
			
			
		}catch (IOException e) {
			
		}
		
		Arrays.sort(data);
		
		for(int i=9; i>6; i--) {
			System.out.println(data[i]);
		}
		
		
		
	}
}