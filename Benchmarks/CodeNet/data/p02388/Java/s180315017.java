import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(System.in);
		String s = input.readLine();

		int temp = Integer.parseInt(s);

		int answer = temp * temp * temp;
		System.out.println(answer);

	}
}