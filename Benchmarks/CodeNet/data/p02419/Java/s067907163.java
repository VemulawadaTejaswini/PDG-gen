import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String character = scanner.nextLine();
		List<String> list = new ArrayList<String>();
		String str;
		int count = 0;
		while (true) {
			str = scanner.next();			
			if(str .equals("END_OF_TEXT")) {
				break;
			}else {
				list.add(str);				
			}
		}
		for(int i = 0; i < list.size(); i++) {
			if(character.equalsIgnoreCase(list.get(i))) {
				count ++;
			}
		}
		System.out.println(count);
	}
}