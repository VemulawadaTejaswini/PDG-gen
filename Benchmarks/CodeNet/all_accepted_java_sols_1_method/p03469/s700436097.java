import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
//		String[] tmpArray = input.split(" ");
//		int n = Integer.parseInt(tmpArray[0]);
//		int a = Integer.parseInt(tmpArray[1]);
//		int b = Integer.parseInt(tmpArray[2]);
		char[] array = input.toCharArray();
		array[3]++;
		
		System.out.println(array);
	}

}
