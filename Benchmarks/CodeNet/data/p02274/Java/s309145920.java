import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	static int [] sortedArray;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inputArray = new int[n];
		sortedArray = new int[n];
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			inputArray[i] = Integer.parseInt(tmpArray[i]);
			sortedArray[i] = inputArray[i];
		}
		Arrays.sort(sortedArray);
		
		System.out.println(inversion(inputArray, 0));
	}
	
	static int inversion(int[] array, int depth){
		int result = 0;
		
		if(array.length == 1){
			return 0;
		}
		int max = sortedArray[array.length - depth - 1];
		int[] newArray = new int[array.length - 1];
		int j = 0;
		for(int i = 0; i < array.length ; i++){
			if(array[i] == max){
				result += array.length - i - 1;
			}
			else{
				newArray[j] = array[i];
				j++;
			}
		}
		result += inversion(newArray, depth++);
		
		return result;
	}

}