import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		int point = 1;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			array.add(scan.nextInt());
		}
		
		Collections.sort(array, Comparator.reverseOrder());
		
		for(int search : array) {
			if(search == 5) {
				point *= 5;
			}
			else if(search == 7) {
				point *= 7;
			}
		}
		if(point == 5 * 5 * 7) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}