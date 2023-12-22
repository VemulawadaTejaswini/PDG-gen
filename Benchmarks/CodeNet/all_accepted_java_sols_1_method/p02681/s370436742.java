import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String t = br.readLine();
		
		if(t.substring(0, t.length() - 1).equals(s))
			System.out.println("Yes\n");
		else
			System.out.println("No\n");
	}

}