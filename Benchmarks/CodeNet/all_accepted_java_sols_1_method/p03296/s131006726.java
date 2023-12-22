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
		
		int n = Integer.parseInt(input);
		
		int[] array = new int[n];
		
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(tmpArray[i]);
		}
		
		int result = 0;
		//色を変えながら進んでいく
		for(int i = 1; i < n; i++){
			if(array[i] == array[i - 1]){
				array[i] = -1;
				result++;
			}
		}
		
		System.out.println(result);
	}

}
