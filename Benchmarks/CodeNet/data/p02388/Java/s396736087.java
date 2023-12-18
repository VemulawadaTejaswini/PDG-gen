import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try {
			String str = reader.readLine();
			int x = Integer.parseInt(str);

			if(x >= 1 && x <= 100){

				System.out.println(x*x*x);
			}
		} catch (IOException e) {
	
			e.printStackTrace();
		}



	}

}