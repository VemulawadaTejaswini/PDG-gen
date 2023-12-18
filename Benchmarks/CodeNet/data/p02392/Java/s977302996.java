import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int a;
		int b;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		a = Integer.parseInt(num[0]);
		b = Integer.parseInt(num[1]);

		int area = a * b;
		int lengthOfAround = a * 2 + b * 2;
		System.out.println(area + " " + lengthOfAround);

	}


}