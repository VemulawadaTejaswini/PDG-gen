import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<Integer,Integer> aMap = new HashMap<>();

		for(int i = 1; i <= n; i++) {
			aMap.put(sc.nextInt(),i);
		}

		sc.close();

		for(int i = 1; i <= n; i++) {
			System.out.print(aMap.get(i) + " ");
		}

		System.out.println();


	}

}
