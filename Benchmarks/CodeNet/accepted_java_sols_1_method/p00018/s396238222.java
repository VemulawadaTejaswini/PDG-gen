import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		list.add(num5);

		Collections.sort(list);
		Collections.reverse(list);

		for(int i = 0; i < 4; i++){

			System.out.print(list.get(i) + " ");
		}

		System.out.println(list.get(4));
	}

}