
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		list.remove(list.indexOf(scan.nextInt()));
		list.remove(list.indexOf(scan.nextInt()));
		
		System.out.println(list.get(0));
	
	}
}