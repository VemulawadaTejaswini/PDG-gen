import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String test = br.readLine();
		String[] result = test.split(" ");
		System.out.println(Integer.parseInt(result[0]) *Integer.parseInt(result[1]) + " " + (Integer.parseInt(result[0]) +Integer.parseInt(result[1]))*2); 
	}

}