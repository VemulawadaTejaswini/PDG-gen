import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String input = reader.readLine();
		String str[] = input.split(" ");
		int height = Integer.parseInt(str[0]);
		int width = Integer.parseInt(str[1]);
		int area = height * width;
		int roundSpan = (height + width) * 2;

		System.out.println(area + " " + roundSpan);

	}
}