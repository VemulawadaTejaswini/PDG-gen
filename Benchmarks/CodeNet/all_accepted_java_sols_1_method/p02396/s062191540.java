import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<Integer>();

		while (true) {
			int num = sc.nextInt();
			if(num != 0) {
				numList.add(num);
			} else {
				break;
			}
		}
		for(int i = 0;i < numList.size();i++) {
			System.out.println("Case " + (i + 1) + ": " + numList.get(i));
		}
		sc.close();
	}
}