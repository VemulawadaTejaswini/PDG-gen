import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] streamLine = br.readLine().split(" ");
		
		int[] intLine = new int[5];
		for (int i = 0; i < 5; i++) {
			intLine[i] = Integer.parseInt(streamLine[i]);
		}
		/*
		 *  Constraint
		 * −100≤x,y≤100
		 *	0<W,H,r≤100
		 *
		 */
		int w = intLine[0];
		int h = intLine[1];
		int x = intLine[2];
		int y = intLine[3];
		int r = intLine[4];
		
		String isInside = "Yes";
		if (x < 0 || y < 0 || x + r > w || y + r > h  || x - r < 0 || y - r < 0) {
			isInside = "No";
		}
		
		System.out.println(isInside);

	}
}
