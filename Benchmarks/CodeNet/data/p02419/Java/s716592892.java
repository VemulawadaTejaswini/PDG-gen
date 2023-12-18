

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		/*
		 * ?????? ???.length < 10 ?????? ??´.length < 1000
		 *
		 * T.contains " " or Enter Ti
		 *
		 * All Ti -> T.contains cnt?
		 *
		 * Example) input- W : computer
		 *
		 * T1: Nurtures computer scientists and highly-skilled computerengineers
		 * T2: who will create and exploit "knowledge" for the newera.
		 * T3: Provides an outstanding computer environment.
		 * T4: END_OF_TEXT if(t4.equl("END_OF_TEXT"))break;
		 *
		 * output- 3
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// declear variable
		String infoW = "", tempT = "";
		//String strT[] = null;
		int cnt = 0;

		// input sample
		infoW = br.readLine();

		// while section
		while (!tempT.equals("END_OF_TEXT")) {
			tempT = br.readLine();
			if (tempT.equals("END_OF_TEXT"))
				break;
			tempT = tempT.toLowerCase();
			if (tempT.contains(infoW))
				cnt++;
		}
		System.out.println(cnt);
	}
}