import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private final static int DATASET = 100;

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int[] stock = new int[DATASET];
			int input, ST, output;

			while ((str = br.readLine()) != null) {
				input = Integer.parseInt(str);
				if (input == 0) {
						ST = search_terminal(stock);
						output = stock[ST-1];
						System.out.println(output);
						stock[ST-1] = 0;
				} else {
					ST = search_terminal(stock);
					stock[ST] = input;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	private static int search_terminal(int[] stock) {
		int k=0;
		for (int i =0; i < stock.length; i++) {
			if (stock[i] == 0) {
				k = i;
				return k;
			}
		}
		return k;
	}

}