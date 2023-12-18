import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){		
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] s = str.split(" ");
		double a = Double.parseDouble(s[0]);
		double b = Double.parseDouble(s[1]);
		int d = (int)(a/b);
		int r = (int) (a%b);
		double f = a/b;
		System.out.printf("%d %d %.6f",d,r,f);
	}
}