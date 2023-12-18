import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		List <Integer> list = new ArrayList<Integer>();
		HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
//		int v1 = Integer.parseInt(sc.next());
//		int v2 = Integer.parseInt(sc.next());
		String s1 = sc.next();		
		String ans_str = "";
		int ans_int = 0;
		Pattern camma = Pattern.compile("[,]");
		StringBuilder sb = new StringBuilder(s1);
		s1 = camma.matcher(s1).replaceAll(" ");			

		
		System.out.println(s1);
		System.out.flush();
		sc.close();
	}
}