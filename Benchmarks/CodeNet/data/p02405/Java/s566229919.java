import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();

		int a, b;


		while ((a = sc.nextInt()) != 0 | (b = sc.nextInt()) != 0) {
			h.add(a);
			w.add(b);
		}

		for(int i = 0; i < h.size(); i++) {

			for(int j = 0; j < h.get(i); j++) {

				for(int k = 0; k < w.get(i); k++) {

					if(j % 2 == 0 && k % 2 == 0){
						System.out.print("#");
					} else if (j % 2 == 0 && k % 2 != 0){
						System.out.print(".");
					} else if (j % 2 != 0 && k % 2 == 0) {
						System.out.print(".");
					} else if (j % 2 != 0 && k % 2 != 0) {
						System.out.print("#");
					}

				}
				System.out.println();

			}
			System.out.println();

		}
	}

}



