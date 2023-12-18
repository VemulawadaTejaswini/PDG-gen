import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		
		scanner.close();
		
		List<Integer> list = new ArrayList<>();
		while (X > 0) {
		    list.add(X % 10);
		    X /= 10;
		}
		
		int result = 0;
		
		for (int i : list) {
			
			result = result + i;
		}
		
		int result2 = result % 9;
		
		if (result2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
	}

}
