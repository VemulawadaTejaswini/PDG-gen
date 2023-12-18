import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> heights = new ArrayList<>();
		
		try(Scanner sc = new Scanner(System.in);){
			
			for(int i = 0; i < 10; i++) {
				heights.add(sc.nextInt());
			}
		}
		
		heights.sort(Comparator.reverseOrder());
		
		for(int i = 0; i < 3; i++) {
			System.out.println(heights.get(i));
		}
	}
}
