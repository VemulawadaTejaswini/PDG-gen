import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strAry = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			if (i == strAry.length - 1) System.out.println(strAry[0]);
			else System.out.print(strAry[strAry.length - i - 1] + " ");
		}
	}
}