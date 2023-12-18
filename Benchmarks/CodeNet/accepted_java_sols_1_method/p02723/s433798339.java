import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();

		// 整数の入力

		System.out.println(buf.charAt(2) == buf.charAt(3) && buf.charAt(4) == buf.charAt(5) ? "Yes" : "No");
	}
}