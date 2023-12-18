import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		double x1, y1, x2, y2;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] coor = in.readLine().split(" ");
		x1 = Double.parseDouble(coor[0]);
		y1 = Double.parseDouble(coor[1]);
		x2 = Double.parseDouble(coor[2]);
		y2 = Double.parseDouble(coor[3]);
		System.out.println(Math.sqrt(Math.pow(x2 - x1, 2)
				+ Math.pow(y2 - y1, 2)));
	}
}