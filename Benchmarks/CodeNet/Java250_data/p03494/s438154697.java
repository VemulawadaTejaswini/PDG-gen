import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		List<Integer> numbers = new ArrayList<Integer>(200);
		for(int i = 1; i <= n; i++) {
			numbers.add(sc.nextInt());
		}

		Integer countDivide = -1;
		boolean canDivide = true;

		while(canDivide) {
			countDivide += 1;
			for(int i = 0; i < n; i++) {
				Integer checkingNum = numbers.get(i);
				if(checkingNum % 2 == 1) {
					canDivide = false;
				} else {
					numbers.set(i, checkingNum / 2);
				}
			}
		}

		System.out.println(countDivide);
	}
}