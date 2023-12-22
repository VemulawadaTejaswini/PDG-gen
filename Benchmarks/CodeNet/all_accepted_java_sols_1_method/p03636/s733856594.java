import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//何個あるかの数
		String s = br.readLine();



		int x = s.length();

		String f = s.substring(0, 1);
		String e = s.substring(x-1);

		System.out.println(f+(x-2)+e);


	}


}