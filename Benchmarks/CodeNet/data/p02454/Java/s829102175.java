import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static public void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(scan.nextInt());
		}

		int m = scan.nextInt();

		for(int i=0; i<m; i++){

			int query = scan.nextInt();

			int lowerResult = ~Collections.binarySearch(list, query, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);			
			System.out.print(lowerResult + " ");
//				System.out.println("debug");
			int upperResult = ~Collections.binarySearch(list, query, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
			System.out.println(upperResult);
				
		}
	}
}

