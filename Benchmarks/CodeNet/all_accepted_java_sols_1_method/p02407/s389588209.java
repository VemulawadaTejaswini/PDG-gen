import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			
			x = in.readLine();
			String[] num_s = x.split(" ");
			
			for (int i = 1; i < num; i++) {
				System.out.print(num_s[num - i] + " ");
			}
			System.out.println(num_s[0]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}