import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		String[] str = reader.readLine().split(" ");
//		int[] ab = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			ab[i] = Integer.parseInt(str[i]);
//		}
		
		int[] abc = new int[5];
		for (int i = 0; i < 5; i++) {
			String line = reader.readLine();
			abc[i] = Integer.parseInt(line);
		}
		String line = reader.readLine();
		int k = Integer.parseInt(line);
		
		if (abc[4]- abc[0] <= k) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}
		
	}
}