import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double X = scanner.nextDouble();
		
		scanner.close();
		
		double tmp = 0;
		
		List<Integer> list = new ArrayList<>();
		while (X > 0) {
		    tmp = tmp + (X % 10);
		    X /= 10;
		}
		
//		int result = 0;
//		
//		for (int i : list) {
//			
//			result = result + i;
//		}
//		
		double result = tmp % 9;
		
		if (result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
	}

}
