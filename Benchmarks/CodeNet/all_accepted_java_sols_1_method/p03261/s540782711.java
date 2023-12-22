import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		String start = null;
		String end = null;
		String judge = "Yes";
		
		for(int i = 0; i < n ; i++) {
			String w = scan.next();
			if (arr.contains(w)) {
				judge = "No";
				break;
			}
			
			start = w.substring(0, 1);
			if(end != null && !start.equals(end)) {
				judge = "No";
				break;
			}
			arr.add(w);
			end = w.substring(w.length()-1);
		}
		System.out.println(judge);
		scan.close();
	}
}