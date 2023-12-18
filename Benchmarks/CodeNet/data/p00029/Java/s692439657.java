import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int wordMaxLength = 0;
		int wordMaxFrequency = 0;
		
		String line = br.readLine().trim();
		String list[] = line.split(" ");

		//String list[] = br.readLine().split(" ");
		int listLength = list.length;
		int count[] = new int[listLength];

		for (int i = 0; i < listLength; i++) {
			if (wordMaxLength < list[i].length()) {
				wordMaxLength = i;
			}

			for (int j = i + 1; j < listLength; j++) {
				if (list[i].equals(list[j])) {
					count[i] += 1;
				}

			}

		}

		for (int i = 0; i < count.length; i++) {
			if (wordMaxFrequency < count[i]) {
				wordMaxFrequency = i;
			}
		}
		System.out.println(list[wordMaxFrequency] + " " + list[wordMaxLength]);

	}

}