import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int taro = 0, hanako = 0;
		while (0 != n--) {
			String[] in = br.readLine().split(" ");
			int com = in[0].compareTo(in[1]);
			if (0 < com) taro += 3;
			else if (0 > com) hanako += 3;
			else { taro++; hanako++; }
		}
		System.out.println(taro + " " + hanako);
	}
}