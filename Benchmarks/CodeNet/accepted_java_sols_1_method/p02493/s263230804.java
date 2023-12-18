import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if (i == 0) {
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
	}
}