

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws Exception {

		
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int L= sc.nextInt();
		ArrayList<String> Line = new ArrayList<String>();

		for(int i = 0;i < N +1;i++) {
				Line.add(sc.nextLine());
		}
		Collections.sort(Line)

		;
		for (String line : Line) {
			System.out.print(line);

		}


	}

}
