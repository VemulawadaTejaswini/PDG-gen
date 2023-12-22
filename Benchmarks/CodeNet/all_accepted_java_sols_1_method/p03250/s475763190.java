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
		List <Integer> list = new ArrayList<Integer>();
		HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
		int v1 = Integer.parseInt(sc.next());
		int v2 = Integer.parseInt(sc.next());		
		int v3 = Integer.parseInt(sc.next());
		list.add(v1);
		list.add(v2);
		list.add(v3);
		
		Collections.sort(list);
		
		System.out.println(list.get(2)*10+list.get(1)+list.get(0));
		System.out.flush();
		sc.close();
	}
}