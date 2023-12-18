import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		
		int n1 = str.indexOf(" ");
		int n2 = str.indexOf(" " , n1 + 1);
		int n3 = str.indexOf(" ", n2 + 1);
		
		int x1 = Integer.parseInt(str.substring(0 , n1));
		int y1 = Integer.parseInt(str.substring(n1 + 1 , n2));
		int x2 = Integer.parseInt(str.substring(n2 + 1 , n3));
		int y2 = Integer.parseInt(str.substring(n3 + 1));
		
		double det = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		
		System.out.println(det);
		
	}

}