import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		List list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				list.add(i*j);

			}

		}

		if(list.indexOf(n)!=-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}