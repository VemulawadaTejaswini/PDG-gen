import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String dataset = br.readLine();

			while (dataset != null) {
				String[] grades = dataset.split(" ", 0);
				int middleResult = Integer.parseInt(grades[0]);
				int termendResult = Integer.parseInt(grades[1]);
				int makeupResult = Integer.parseInt(grades[2]);

				if (middleResult == -1 || termendResult == -1) {
					System.out.println("F");
				} else if (middleResult + termendResult >= 80) {
					System.out.println("A");
				} else if (middleResult + termendResult >= 65) {
					System.out.println("B");
				} else if (middleResult + termendResult >= 50) {
					System.out.println("C");
				} else if (middleResult + termendResult >= 30) {
					if (makeupResult >= 50) {
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				} else {
					System.out.println("F");
				}
				dataset = br.readLine();
			}
		} catch (IOException e) {
		}
	}
}