import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int x1 = Integer.parseInt(sa[0]);
		int y1 = Integer.parseInt(sa[1]);
		int x2 = Integer.parseInt(sa[2]);
		int y2 = Integer.parseInt(sa[3]);
		br.close();

		int x3 = x2 + y1 - y2;
		int y3 = y2 + x2 - x1;
		int x4 = x3 + x1 - x2;
		int y4 = y3 + y1 - y2;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
