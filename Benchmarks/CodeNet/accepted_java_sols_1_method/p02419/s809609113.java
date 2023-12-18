import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		String findWord = s.nextLine();
		List<String> result = new ArrayList<>();
		while (true) {
			String word = s.next();
			if (word.equals("END_OF_TEXT")) {
				break;
			} else {
				result.add(word);
			}

		}
		for(int i = 0; i< result.size();i++) {
			if(result.get(i).equalsIgnoreCase(findWord)) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}