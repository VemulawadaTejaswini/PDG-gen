import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String input = br.readLine();
			int num = Integer.parseInt(input);
			
			System.out.println(num * num * num);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
