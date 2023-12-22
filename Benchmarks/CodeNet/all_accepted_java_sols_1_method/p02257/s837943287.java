import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		
		try {
			int lim = Integer.parseInt(in.readLine());
			
			int ans = 0;
			for (int i = 0; i < lim; i++) {
				x = in.readLine();
				int num = Integer.parseInt(x);

				boolean flag = true;
				for (int j = 2; (j * j) <= num; j++) {
					if (num % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) ans++;
			}
			System.out.println(ans);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}