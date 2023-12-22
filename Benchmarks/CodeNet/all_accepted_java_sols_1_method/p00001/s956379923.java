import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] data = new int[10];
		try {
			for (int i = 0; i < 10; i++) {
				data[i] = Integer.parseInt(in.readLine());
			}
			Arrays.sort(data);
			
			for (int i = 0; i < 3; i++) {
				System.out.println(data[9 - i]);
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