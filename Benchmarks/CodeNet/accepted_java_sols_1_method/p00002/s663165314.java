import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] datasetstr = new String[2];
		int[] datasetint = new int[2];
		while (str != null) {
			datasetstr = str.split(" ", 2);
			datasetint[0] = Integer.parseInt(datasetstr[0]);
			datasetint[1] = Integer.parseInt(datasetstr[1]);
			System.out.println(Math.round(Math.ceil(Math.log10(datasetint[0]
					+ datasetint[1] + 1))));
			str = br.readLine();
		}
	}
}