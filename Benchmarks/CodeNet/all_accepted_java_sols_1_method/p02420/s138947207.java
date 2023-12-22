import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while ((str = br.readLine()) != null) {
			if (str.equals("-")) break;
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int h = Integer.parseInt(br.readLine());
				str = str.substring(h, str.length()) + str.substring(0, h);
			}
			
			System.out.println(str);
		}
	}

}