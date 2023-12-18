import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] inputList = br.readLine().split(" ");
			int H = Integer.parseInt(inputList[0]);
			int[] a = new int[H];
			int i, x;
			for (i = 0; i < H; i++) {
				inputList = br.readLine().split(" ");
				for (x = 0; x < inputList.length; x++) {
					a[i] = a[i] + Integer.parseInt(inputList[x]);
				}
			}
			for (i = 0; i < H; i++) {
				String input = br.readLine();
				a[i] = a[i] + Integer.parseInt(input);
			}
			br.readLine(); // Why ZERO???
			for (i = 0; i < H; i++) {
				System.out.println(a[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}