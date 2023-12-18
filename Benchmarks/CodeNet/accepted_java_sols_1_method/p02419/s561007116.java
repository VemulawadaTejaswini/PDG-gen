import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int[] flag = new int[26];
		String str = "";
		Scanner scan = new Scanner(System.in);
		String W = scan.nextLine();
		W = W.toLowerCase();
		try{
		while (scan.hasNextLine()) {
			String tmp = "";
			tmp = scan.nextLine();
				str = str + tmp.toLowerCase() + " ";
				if(tmp.length() == 0){
					break;
				}
		}
	}finally{
	}
		int cnt = 0;
		String[] s = str.split(" ");

		for (int i = 0; i < s.length;i++) {
			if(W.equals(s[i])){
				// System.out.println(s[i] +","+i);
				cnt++;
			}
		}

			System.out.println(cnt);
	}

}

