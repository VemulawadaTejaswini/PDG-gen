import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		//計算
		int d = a / b;
		int r = a % b;
		double f = a / b;
		System.out.println(d + " " + r + " " + f);
	}
}