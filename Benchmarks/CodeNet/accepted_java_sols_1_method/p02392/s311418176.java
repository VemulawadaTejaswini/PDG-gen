import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] split = str.split(" ",0);
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			int c = Integer.parseInt(split[2]);

			if (a < b && b < c) {
				System.out.println("Yes");
			} else { 
				System.out.println("No");
			}
		} catch (Exception e) {
			System.out.println("??¨??????");
		}
	}
}