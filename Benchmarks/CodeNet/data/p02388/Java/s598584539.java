import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Squared {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.print(x*x*x);
	}

}


