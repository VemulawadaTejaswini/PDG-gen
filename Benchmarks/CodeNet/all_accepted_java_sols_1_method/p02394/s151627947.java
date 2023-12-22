import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String[] strAry = br.readLine().split(" ");
		int w = Integer.parseInt(strAry[0]);
		int h = Integer.parseInt(strAry[1]);
		int x = Integer.parseInt(strAry[2]);
		int y = Integer.parseInt(strAry[3]);
		int r = Integer.parseInt(strAry[4]);
		if (r <= x && x <= (w - r) && r <= y && y <= (h - r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}