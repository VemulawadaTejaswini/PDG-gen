import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intAry = new int[51];
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for(int l = 0; l <= 9; l++){
						intAry[i+j+k+l]++;
					}
				}
			}
		}
		
		String input;
		while((input = br.readLine()) != null){
			System.out.println(intAry[Integer.parseInt(input)]);
		}
	}
}