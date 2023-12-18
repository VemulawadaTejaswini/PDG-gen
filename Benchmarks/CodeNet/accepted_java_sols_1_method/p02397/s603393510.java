import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numList1 = new ArrayList<Integer>();
		ArrayList<Integer> numList2 = new ArrayList<Integer>();

		while (true) {
			String[] lines = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(lines[0]);
			int num2 = Integer.parseInt(lines[1]);
			if(num1 == 0 && num2 == 0) {
				break;
			} else {
				numList1.add(num1);
				numList2.add(num2);
			}
		}
		for(int i = 0;i < numList1.size();i++) {
			if(numList1.get(i) > numList2.get(i)) {
				int x = numList1.get(i);
				numList1.set(i, numList2.get(i));
				numList2.set(i, x);
			}
			System.out.println(numList1.get(i) + " " + numList2.get(i));
		}
		sc.close();
	}
}