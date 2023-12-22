

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int d,a;
		ArrayList<Integer>array = new ArrayList<Integer>();

		for(int i=0; i<K; i++) {
			d = scanner.nextInt();
			for(int j=0; j<d; j++) {
				a = scanner.nextInt();
				if( !array.contains(a) ) {
					array.add(a);
				}
			}
		}

		System.out.println( N - array.size() );

		scanner.close();


	}

}
