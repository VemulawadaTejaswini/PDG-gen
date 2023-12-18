import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String[] strAry = bf.readLine().split(" ");
		int a = Integer.parseInt(strAry[0]);
		int b = Integer.parseInt(strAry[1]);
		int c = Integer.parseInt(strAry[2]);
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}