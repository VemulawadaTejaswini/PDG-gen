import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> str = new ArrayList<String>();
		int strCnt = 0;
		while(true){
			String tmp = scan.nextLine();
			if(tmp.equals("-")){
				break;
			}
			str.add(tmp);
			int num = Integer.parseInt(scan.nextLine());
			int cnt = 0;
			while(cnt<num){
				int h = Integer.parseInt(scan.nextLine());
				// try{
				// 	String tmp = scan.nextLine();
				// 	if(tmp.equals("-")){
				// 		System.out.print(str);
				// 		return;
				// 	}
				// 	h  = Integer.parseInt(tmp);
				// }catch(NumberFormatException e){
				// 	break;
				// }
				String first = str.get(strCnt).substring(0,h);
				String second = str.get(strCnt).substring(h, str.get(strCnt).length());
				// System.out.println(first+","+second);
				str.set(strCnt,second + first);
				// System.out.println(str);
				cnt++;
			}
			strCnt++;
		}
		for(String s: str){
			System.out.println(s);
		}
	}

}

