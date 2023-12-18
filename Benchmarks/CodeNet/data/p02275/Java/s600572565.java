import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = br.readLine().split(" ");
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(tmpArray[i]);
		}
		//?????§???????´¢
		int k = 0;
		
		for(int i = 0; i < n; i++){
			if(k < array[i]){
				k = array[i];
			}
		}
		
		int[] output = CountingSort(array, k);
		
		for(int i = 0; i < output.length ; i++){
			System.out.print(output[i]);
			if(i != output.length - 1){
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}

	static int[] CountingSort(int[] input, int k){
		int[] output = new int[input.length];
		int[] count = new int[k + 1];
		Arrays.fill(count, 0);
		
		for(int j = 0; j < input.length ;j++){
			count[input[j]]++;
		}
		
		for(int i = 1; i <= k ; i++){
			count[i] = count[i] + count[i - 1];
		}
		
		for(int j = input.length - 1; j >= 0 ; j--){
			output[count[input[j]] - 1] = input[j];
			count[input[j]]--;
		}
		
		return output;
	}
}