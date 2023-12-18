
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		String temp;
		temp = as[0];
		as[0] = as[1];
		as[1] = temp;
		
		temp = as[0];
		as[0] = as[2];
		as[2] = temp;
		
		System.out.println(as[0] + " " + as[1] + " " + as[2]);
		
	}

}

