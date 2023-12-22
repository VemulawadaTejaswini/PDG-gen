import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		
		int first = (S.length()-1) / 2;
		int second = (S.length()+3) / 2;
		
		String fs = S.substring(0, first);
		String ss = S.substring(second - 1, S.length());
		
		if(fs.equals(ss))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}