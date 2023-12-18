import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		char[] ch = S.toCharArray();
		
		if(ch[0] == ch[1] && ch[1] == ch[2])
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}