import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	final static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static String line = "";
	static int a = 0;
	static String op = "";
	static int b = 0;

	// TODO ?????????????????????????????????????????????
	public static void main(String[] args) throws Exception {
		boolean qFlag = true;
		syokika();
		while (qFlag) {
			if (op.equals("?")) {
				qFlag = false;
			} else
				switch (op) {
				case ("+"):
					System.out.println(a + b);
					syokika();
					break;
				case ("-"):
					System.out.println(a - b);
					syokika();
					break;
				case ("*"):
					System.out.println(a * b);
					syokika();
					break;
				case ("/"):
					System.out.println(a / b);
					syokika();
					break;
				}
		}
	}

	private static void syokika() throws IOException {
		a = 0;
		op = "";
		b = 0;
		line = br.readLine();
		String[] hikakuStr = line.split("[\\s]+");
		a = Integer.parseInt(hikakuStr[0]);
		op = hikakuStr[1];
		b = Integer.parseInt(hikakuStr[2]);
	}
}