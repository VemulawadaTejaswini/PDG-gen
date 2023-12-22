import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String W = in.readLine();

			double R= Integer.parseInt(W.split(" ")[0]);


         System.out.println(R*2*3.14159);
	}

}
