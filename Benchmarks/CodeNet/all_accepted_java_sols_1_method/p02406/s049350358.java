import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = null;
		try {
			input = br.readLine();
		} catch (IOException e) {
		}
		int n = Integer.parseInt(input);

		for(int i = 1; i <= n; i++){
			if( i % 3 == 0 || String.valueOf(i).indexOf("3") >= 0){
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}
}

