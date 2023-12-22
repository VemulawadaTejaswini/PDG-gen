import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String X = scanner.next();
		
		scanner.close();

		
		String[] tmpList = String.valueOf(X).split("");
		
		int [] ch = new int[tmpList.length];
		
		for (int i = 0; i < tmpList.length; i++) {
			ch[i] = Integer.parseInt(tmpList[i]);
		}
		
		double result2 = java.util.Arrays.stream(ch).sum();
				
		double result = result2 % 9;
		
		if (result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
	}

}
