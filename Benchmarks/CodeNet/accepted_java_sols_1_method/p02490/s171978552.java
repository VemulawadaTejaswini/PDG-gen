import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("0 0")) {
				break;
			}
			int[] arr = new int[2];
			for (int i = 0; i < line.split(" ").length; i++) {
				arr[i] = Integer.parseInt(line.split(" ")[i]);
			}
			java.util.Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[1]);
		}
	}
}