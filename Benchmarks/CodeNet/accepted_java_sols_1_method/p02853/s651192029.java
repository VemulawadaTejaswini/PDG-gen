import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<List<Integer>> ptnList = new ArrayList<List<Integer>>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int a = 0;

		switch(x) {
		case 1:
			a += 300000;
			break;
		case 2:
			a += 200000;
			break;
		case 3:
			a += 100000;
			break;
		}

		switch(y) {
		case 1:
			a += 300000;
			break;
		case 2:
			a += 200000;
			break;
		case 3:
			a += 100000;
			break;
		}

		if(x == 1 && y ==1) {
			a += 400000;
		}


		System.out.println(a);

		sc.close();
	}


}
