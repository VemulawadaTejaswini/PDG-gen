import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String W = in.readLine();

			int A= Integer.parseInt(W.split(" ")[0]);
			int B= Integer.parseInt(W.split(" ")[1]);
			int C= Integer.parseInt(W.split(" ")[2]);


         System.out.println(C+" "+A+" "+ B);
	}

}
