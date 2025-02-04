/* Filename: ARC063C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String S = input.next();
			
			int countDiff = 0;
			for(int i = 1; i < S.length(); ++i){
				if(S.charAt(i) != S.charAt(i - 1)){
					++countDiff;
				}
			}
			
			System.out.println(countDiff);
		}
	}

}
