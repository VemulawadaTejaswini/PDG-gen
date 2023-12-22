import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

			String line = br.readLine();
			int a = Integer.parseInt(line);

			int hour = a / 3600;
			int minute = (a - 3600 * hour) / 60;
			int s = a - 3600 * hour - 60 * minute;

			System.out.println(hour + ":" + minute + ":" + s);
	}
}