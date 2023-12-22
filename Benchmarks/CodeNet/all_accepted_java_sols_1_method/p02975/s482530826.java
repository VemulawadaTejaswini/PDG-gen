import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i = 0 ; i < N ; i++) {
			a.add(sc.nextInt());
		}

		int result = a.get(0);


		for(int i = 1 ; i < N ; i++) {
			result ^=   a.get(i);
		}

		if(result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}