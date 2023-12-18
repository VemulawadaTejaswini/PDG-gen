import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try {
			int n = 0;
			for (int i = 0; i < 10000; i++) {
				int data = Integer.parseInt(br.readLine());
				if (data == 0) {
					break;
				}
				sb.append("Case ").append(Integer.toString(n++)).append(": ").append(Integer.toString(data)).append("\n");
			}
			System.out.println(sb);
		} catch (Exception e) {
			System.out.println("??¨??????");
		}
	}
}