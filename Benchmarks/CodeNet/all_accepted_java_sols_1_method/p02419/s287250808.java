import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String w = s.nextLine();
		int count = 0;
		List<String> t = new ArrayList<>();
		
		while(true) {
			String test = s.next();
			if(test.equals("END_OF_TEXT")) {
				break;
			}else {
				t.add(test);
			}
		}
		
		for(int j =0;j<t.size();j++) {
			if(t.get(j).equalsIgnoreCase(w)) {
				count++;
			}
		}

		System.out.println(count);
	}

}