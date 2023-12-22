import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args){
		ArrayList <Integer> list = new ArrayList<Integer>();
//		String [][] boad = new String[4][4];
		int a = Integer.parseInt(sc.next());
		int total = 0;
		String answer;		
		for(int i = 0;i<a;i++){
			list.add(Integer.parseInt(sc.next()));
		}
		
		Collections.sort(list);
		for(int i = 0;i<a-1;i++){
			total += list.get(i);
		}
		if(list.get(a-1)<total){
			answer = "Yes";
		}else{
			answer = "No";
		}
		
		
		System.out.println(answer);
		System.out.flush();
		sc.close();

	}
}