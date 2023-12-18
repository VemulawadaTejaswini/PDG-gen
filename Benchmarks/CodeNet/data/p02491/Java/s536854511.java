import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		String[]	s	= new String[2];
		int a,b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);

		System.out.println((int)a/b + " " + a%b + " " + (float)a/b);
	}
}