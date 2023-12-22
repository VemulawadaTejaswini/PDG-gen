import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String[] in = null;
		int a, b;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		try {
			while((line = input.readLine()) != null) {
				in = line.split(" ");
				a = Integer.valueOf(in[0]);
				b = Integer.valueOf(in[1]);
				System.out.println(String.valueOf(a+b).length());
			}
		} catch (NumberFormatException e) {
			System.out.println(line + "は整数でないものが含まれる");
		} catch (IOException e) {
			System.out.println("入出力例外");
		}
	}

}
