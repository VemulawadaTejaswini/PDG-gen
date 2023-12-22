import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		//		String [][] boad = new String[4][4];
		List <Integer> list = new ArrayList<Integer>();
		List <String> list2 = new ArrayList<String>();
		String s = sc.next();
		int answer = 0;
//		int in = Integer.parseInt(sc.next());
//		int c = 0;
		String d = "";
		for(int i = 0;i <s.length();i++){
			list2.add(String.valueOf(s.charAt(i)));
		}

		for(int i = 0;i <list2.size();i++){
			if(list2.get(i).equals("9")){
				list2.set(i, "1");
			}else if(list2.get(i).equals("1")){
				list2.set(i, "9");
			}
			d += list2.get(i);
		}
		
//		for(int i = 0;i<n;i++){
//			list.add(Integer.parseInt(sc.next()));
//		}
		
		System.out.println(d);
		System.out.flush();
		sc.close();
	}
}