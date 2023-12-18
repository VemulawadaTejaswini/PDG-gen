//s

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		Long X = sc.nextLong();
		Long K = sc.nextLong();
		Long D = sc.nextLong();
		sc.close();

		long tmp = X/D;

		long moveCount;

		if(K < tmp) {
			moveCount = K;
		}
		else {
			moveCount = ( K % 2 == tmp % 2 )? tmp : tmp + 1;
		}

		long movedIndex = X - D * moveCount;
		System.out.println(Math.abs(movedIndex));
	}

}
