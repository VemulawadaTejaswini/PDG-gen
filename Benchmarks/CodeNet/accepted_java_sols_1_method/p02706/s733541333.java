import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int holiday = scanner.nextInt();
		
		int homework = scanner.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < homework; i++) {
			
			list.add(scanner.nextInt());
		}
		
		scanner.close();
		
		int result = holiday - list.stream().mapToInt(x -> x).sum();
		
		if (result < 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
		
	}

}
