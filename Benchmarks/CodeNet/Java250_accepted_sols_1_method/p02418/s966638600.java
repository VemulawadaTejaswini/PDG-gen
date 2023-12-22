

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		/*
		 * Ring StrS = random point;
		 *
		 * ????¨????????????? StrP
		 *
		 * 1???????????????????????°
		 *
		 * 1 <= P.length <= S.length <= 100
		 *
		 *	>> YES or NO ?
		 */

		// input info
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// variable declear
		String strS,strP ;

		// break condition
		//while((strS=br.readLine())!=null || (strP=br.readLine())!=null ){
		strS = br.readLine();
		strP = br.readLine();

		// Check Works
		strS += strS;

		//output info
		if(strS.contains(strP))
			System.out.println("Yes");
		else
		System.out.println("No");
		}
	}