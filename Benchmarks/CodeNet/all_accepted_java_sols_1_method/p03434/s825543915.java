import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		List<Integer> numbers = new ArrayList<Integer>(n);
		for(int i = 1; i <= n; i++) {
			numbers.add(sc.nextInt());
		}
		Collections.sort(numbers, Collections.reverseOrder());
		
		Integer a = 0;
		Integer b = 0;
		for(int i = 0; i < n; i ++) {
			if(i % 2 == 0) {
				a += numbers.get(i);
			} else {
				b += numbers.get(i);
			}
		}
		System.out.println(a - b);
	}
}