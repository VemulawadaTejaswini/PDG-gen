import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int i = 1;

			while(true){
			String str = br.readLine();
			int x = Integer.parseInt(str);
			if (x == 0) break;
			System.out.println("Case "+i+": "+x);
			i++;
			}
	}
}