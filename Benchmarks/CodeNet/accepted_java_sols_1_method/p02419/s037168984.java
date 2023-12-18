import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int number = 0;

		String Word = stdin.nextLine();

		List<String> result = new ArrayList<>();

		while (true) {
			String word = stdin.next();
			if (word.equals("END_OF_TEXT")) {
				break;
			} else {
				result.add(word);
			}
		}
		for(int i = 0; i< result.size();i++) {
            if(result.get(i).equalsIgnoreCase(Word)) {
            	number++;
            }          

    }
    System.out.println(number);

}

	}