import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		double a = Integer.parseInt(strs[0]);
		double b = Integer.parseInt(strs[1]);
		//計算
		int d = (int) (a / b);
		int r = (int) (a % b);
		double f = a / b;
		String f2 = String.format("%.5f", f);
		System.out.println(d + " " + r + " " + f2);
		br.close();
	}
}