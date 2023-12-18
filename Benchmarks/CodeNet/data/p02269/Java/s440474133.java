
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(bufferedReader.readLine());
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String order[] = bufferedReader.readLine().split(" ");
			if (order[0].equals("insert")) {
				strings.add(order[1]);
			} else if (order[0].equals("find")) {
				if (strings.stream().anyMatch(e -> e.equals(order[1]))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
			
		}
	}

}