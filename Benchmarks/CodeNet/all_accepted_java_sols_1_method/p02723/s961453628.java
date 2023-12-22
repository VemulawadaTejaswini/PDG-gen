import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		if(ch[2] == ch[3] && ch[4] == ch [5])
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}