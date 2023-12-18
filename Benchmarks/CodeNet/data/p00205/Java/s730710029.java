
//Rock, Paper, Scissors
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int count = 0;
		String[] data = new String[5];
		String judge;

		while (!(input = in.readLine()).equals("0")) {

			data[count] = input;
			count++;

			if (count == 5) {

				judge = Judge(data);

				for (int i = 0; i < data.length; i++) {

					if (judge.equals("drow")) {
						System.out.println("3");
					} else if (judge.equals(data[i])) {
						System.out.println("1");
					} else {
						System.out.println("2");
					}

				}

				count = 0;
			}

		}
	}

	private static String Judge(String[] data) {

		boolean rock = false;
		boolean paper = false;
		boolean scissors = false;

		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("1")) {
				rock = true;
			} else if (data[i].equals("2")) {
				paper = true;
			} else if (data[i].equals("3")) {
				scissors = true;
			}
		}

		if (rock && !paper && scissors) {
			return "1";
		} else if (!rock && paper && scissors) {
			return "2";
		} else if (rock && paper && !scissors) {
			return "3";
		}

		return "drow";
	}

}