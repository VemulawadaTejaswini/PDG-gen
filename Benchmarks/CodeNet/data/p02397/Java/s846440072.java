import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		while(true){
			String[] arr = reader.readLine().split(" ", 0);
			int[] arr_int = new int[2];
			for (int i =0; i< 2; i++){
				arr_int[i] = Integer.parseInt(arr[i]);
			}
			if (arr_int[0] == arr_int[1] && arr_int[0] == 0){
				
				break;
			}
			change(arr_int);
			builder.append(arr_int[0]).append(" ").append(arr_int[1]).append("\n");
		}
		System.out.print(builder);

	}
	
	public static void change(int[] array){
		if (array[0] > array[1]){
			int tmp = array[0];
			array[0] = array[1];
			array[1] = tmp;
		}
	}

}