import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(scan.nextInt());
		list.add(scan.nextInt());
		list.add(scan.nextInt());

		Collections.sort(list);
		
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		scan.close();

	}

}