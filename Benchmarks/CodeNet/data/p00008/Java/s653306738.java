import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sum4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int inputAngka = Integer.parseInt(input);
		int counter = 0;
		
		for(int i = 0; i <= 9; i++){
			for(int j = 0; j <= 9; j++){
				for(int k = 0; k <= 9; k++){
					for(int l = 0; l <= 9; l++){
						if(i + j + k + l == inputAngka){
							counter++;
						}
					}
				}
			}
		}
		
		System.out.println(counter);
	}
}