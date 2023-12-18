import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		//String value[] = inputed.split("[\\s]+");
		int intInputed = Integer.parseInt(inputed);

		int minute = intInputed / 60;
		int hours =  minute / 60;

		System.out.println(hours + ":" + (minute % 60) + ":" + (intInputed % 60));

	}
}