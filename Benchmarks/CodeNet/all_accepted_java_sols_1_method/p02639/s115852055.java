import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			
			list.add(scanner.next());
		}
		
		scanner.close();
		
		int result = list.indexOf("0");
		
			
		System.out.println(result + 1);
	}

}
