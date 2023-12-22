import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String str = "";
		try {
			while ((str = in.readLine()) != null) {
				String[] p = str.split(" ");
				int a = Integer.parseInt(p[0]);
				int b = Integer.parseInt(p[2]);
				
				if (p[1].equals("+")) System.out.println(a + b);
				if (p[1].equals("-")) System.out.println(a - b);
				if (p[1].equals("*")) System.out.println(a * b);
				if (p[1].equals("/")) System.out.println(a / b);
				
				if (p[1].equals("?")) break;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}