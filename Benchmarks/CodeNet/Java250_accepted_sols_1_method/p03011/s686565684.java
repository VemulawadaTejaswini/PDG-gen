import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		list.add(sc.nextInt());	// P
		list.add(sc.nextInt());	// Q
		list.add(sc.nextInt());	// R
		
		list.sort(Comparator.naturalOrder());
		
		System.out.println(list.get(0) + list.get(1));
	}
	
	
}