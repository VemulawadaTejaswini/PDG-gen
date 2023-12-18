import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			list.add(scanner.next());
		}
		
		scanner.close();
		
		for (String s : list) {
			
			if ("AC".equals(s)) {
				AC++;
			} else if ("WA".equals(s)) {
				WA++;
			} else if ("TLE".equals(s)) {
				TLE++;
			} else if ("RE".equals(s)) {
				RE++;
			} else {
				
			}
		}
		
		System.out.println("AC x " + AC);
		System.out.println("WA x " + WA);
		System.out.println("TLE x " + TLE);
		System.out.println("RE x " + RE);
	}

}
