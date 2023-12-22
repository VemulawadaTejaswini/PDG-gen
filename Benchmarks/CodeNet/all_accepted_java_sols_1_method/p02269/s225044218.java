
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Set<String> dictionary = new HashSet<String>();
		for (int i = 0; i < num; i++) {
			String com = br.readLine();
			String[] commands = com.split(" ");
			String command = commands[0];
			String word = commands[1];
			if (command.equals("insert")) {
				dictionary.add(word);
			} else {
				if (dictionary.contains(word)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}

	}
}
