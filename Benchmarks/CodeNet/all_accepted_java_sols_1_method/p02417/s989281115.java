import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int[] flag = new int[26];
		String str = "";
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// try{
		// str = br.readLine();
		// }catch(IOException e){

		// }
		Scanner scan = new Scanner(System.in);
		try{
		while (scan.hasNextLine()) {
			String tmp = "";
			tmp = scan.nextLine();
				str = str + tmp;
				// System.out.println(tmp.length());
				if(tmp.length() == 0){
					break;
				}
		}
	}finally{
	}
		int cnt = 0;
		while (cnt < str.length()) {
			char s = str.charAt(cnt);
			// if((int)s >= 65 && (int)s <= 122){
			if ((int) s >= 65 && (int) s <= 90) {
				flag[s - 65]++;
			} else if ((int) s >= 97 && (int) s <= 122) {
				flag[s - 97]++;
			}
			// }
			cnt++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 97) + " : " + flag[i]);
		}
	}

}

