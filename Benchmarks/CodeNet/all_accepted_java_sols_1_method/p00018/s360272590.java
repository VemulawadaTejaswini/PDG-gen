import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		List<Integer> ints = new ArrayList<Integer>();
		for(int i=0;i<5;i++) ints.add(in.nextInt());

		sort(ints);
		for(int i=ints.size()-1;i>=0;i--) {
			System.out.print(ints.get(i));
			if(i!=0) System.out.print(" ");
		}
		System.out.println("");
	}

}