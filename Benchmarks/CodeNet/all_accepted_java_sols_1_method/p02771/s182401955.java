import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		List<Integer> numlist = Arrays.asList(num1, num2, num3);
		Collections.sort(numlist);
		if (numlist.get(0) != numlist.get(1) && numlist.get(1) != numlist.get(2)) {
			System.out.println("No");
		} else if (numlist.get(0) == numlist.get(1) && numlist.get(1) == numlist.get(2)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}

}
