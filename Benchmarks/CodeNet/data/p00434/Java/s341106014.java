import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] submit = new boolean[30];
		Arrays.fill(submit, false);
		
		for(int i = 0; i < 28 ; i++){
			submit[Integer.parseInt(br.readLine()) - 1] = true;
		}
		
		for(int i = 0; i < 30; i++){
			if(submit[i] == false){
				System.out.println(i + 1);
			}
		}
	}

}