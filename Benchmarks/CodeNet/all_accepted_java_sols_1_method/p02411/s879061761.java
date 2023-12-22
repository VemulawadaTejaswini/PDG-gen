

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	/*
	 *****class, math TEST point
	 *
	 * n People
	 *
	 * 1) midTest > m ***** 2) lastTest > f
	 * m,f<=50
	 * 3) retryTest > r
	 * r<=100
	 *
	 * 4) noTest > -1
	 *
	 ******* output constraint
	 *
	 * 1. 1) || 2) -1 > F
	 * 2. 1) + 2) 80~ > A
	 * 3. 1) + 2) 65~80 > B
	 * 4. 1) + 2) 50~65 > C
	 * 5. 1) + 2) 30~50 > D -- but, +3) 50~ > C
	 * 6. 1) + 2) 30 > F
	 *
	 *********** " ", m,f,r
	 ******** m,f,r > -1-1-1 > exit;
	 *
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * 40 42 -1??? 20 30 -1??? 0 2 -1 ???-1 -1 -1
		 */
		do{
		// ?????±????????????
		String[] point = br.readLine().split(" ");

			//for (int i = 0; i < point.length; i++) {
			int midTest = Integer.parseInt(point[0]);
			int lastTest = Integer.parseInt(point[1]);
			int retryTest = Integer.parseInt(point[2]);
			int totPoint = midTest + lastTest;

			// 1???????????????
			if (midTest == -1 && lastTest == -1 && retryTest == -1)
				break;
			else if (midTest == -1 || lastTest == -1 || totPoint < 30)
				System.out.println("F");
			else if (totPoint >= 80)
				System.out.println("A");
			else if (totPoint < 80 && totPoint >= 65)
				System.out.println("B");
			else if (totPoint < 65 && totPoint >= 50 || retryTest >= 50)
				System.out.println("C");
			else
				System.out.println("D");
	}while(true);
}
}