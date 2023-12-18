import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] input = new int[10];
		boolean[] checked = new boolean[10];
		
		for(int i = 0; i < 10; i++){
			input[i] = Integer.parseInt(br.readLine());
			checked[i] = false;
		}
		
		for(int i = 0 ; i < 3; i++){
			int maxIndex = -1;
			int max = -1;
			
			for(int j = 0; j < 10; j++){
				if(input[j] > max && checked[j] == false){
					max = input[j];
					maxIndex = j;
				}
			}
			
			checked[maxIndex] = true;
			System.out.println(input[maxIndex]);
		}
		
	}

}