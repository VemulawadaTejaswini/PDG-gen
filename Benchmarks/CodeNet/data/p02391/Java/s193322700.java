import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			
			if (a < b) {
				System.out.println("a < b");
			}else if (a > b) {
				System.out.println("a > b");
			}else if (a == b) {
				System.out.println("a == b");
			}
		
		} catch (IOException e) {
		}
	}
}