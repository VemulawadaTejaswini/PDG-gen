import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputed = new String(in.readLine());

		String value[] = inputed.split("[\\s]+");
		//int intInputed = Integer.parseInt(inputed);

		int W  = Integer.parseInt(value[0]);
		int H = Integer.parseInt(value[1]);
		int x  = Integer.parseInt(value[2]);
		int y = Integer.parseInt(value[3]);
		int r  = Integer.parseInt(value[4]);

		boolean jugde = true;

		if ((x - r >= 0 ) && ((x + r) - W <= 0)) {
			if ((y - r >= 0 ) && ((y + r) - H <= 0)) {
				jugde = true;
			} else {
				jugde = false;
			}
		} else {
			jugde = false;
		}

		if (jugde == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}