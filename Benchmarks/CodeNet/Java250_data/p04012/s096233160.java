import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.nextLine();
		String[] wArray = new String[w.length()];
		
		for(int i = 0; i < w.length(); i++) {
			wArray[i] = w.substring(i, i + 1);
		}
		
		List<String> wList = new ArrayList<String>(Arrays.asList(wArray));
		List<String> wHashList = new ArrayList<String>(new HashSet<>(wList));
		int sum = 0;
		
		for(int i = 0; i < wHashList.size(); i++) {
			for(int j = 0; j < w.length(); j++) {
				if(wHashList.get(i).equals(w.substring(j, j + 1))) {
					sum++;
				}
			}
			if(sum % 2 == 1) {
				break;
			} else {
				sum = 0;
			}
		}
		
		if(sum % 2 == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		scan.close();
	}

}
