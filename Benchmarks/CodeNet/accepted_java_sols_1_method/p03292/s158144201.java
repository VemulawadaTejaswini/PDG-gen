import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] aline = br.readLine().split(" ");
		int a1 = Integer.parseInt(aline[0]);
		int a2 = Integer.parseInt(aline[1]);
		int a3 = Integer.parseInt(aline[2]);

		int max = Math.max(a1, Math.max(a2, a3));
		int min = Math.min(a1, Math.min(a2, a3));

		System.out.println(max - min);

	}

}
