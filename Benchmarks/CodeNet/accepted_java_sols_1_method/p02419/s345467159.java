import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			String W = sc.next();
			
			List<String> list = new ArrayList<>();
			
			while(true) {
				String word = sc.next();
				
				if(word.equals("END_OF_TEXT")) break;
				
				word = word.toLowerCase();
				
				if(word.endsWith(".")) {
					word = word.substring(0, word.length() - 1);
				}
				
				list.add(word);
			}
			
			long count = list.stream().filter(e -> e.equals(W)).count();
			
			System.out.println(count);
		}
	}
}
