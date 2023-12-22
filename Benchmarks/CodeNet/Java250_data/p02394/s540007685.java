import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readline = br.readLine();

		String[] set = readline.split(" ");

		int W = Integer.parseInt(set[0]);
		int H = Integer.parseInt(set[1]);
		int x = Integer.parseInt(set[2]);
		int y = Integer.parseInt(set[3]);
		int r = Integer.parseInt(set[4]);

		if ((x-r>=0) && (y+r<=H) && (x+r<=W) && (y-r>=0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}