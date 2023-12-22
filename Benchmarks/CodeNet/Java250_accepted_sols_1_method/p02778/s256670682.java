import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int length = s.length();
		String res = "";
		for(int i = 0; i < length;i++) {
			res += "x";
		}
		System.out.println(res);
	}

}
