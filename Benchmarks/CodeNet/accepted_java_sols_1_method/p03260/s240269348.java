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
		int v1 = Integer.parseInt(sc.next());
		int v2 = Integer.parseInt(sc.next());;
		String ans = "";
		if (v1*v2%2 == 0){
			ans = "No";
		}else{
			ans = "Yes";
		}
		
		System.out.println(ans);
		System.out.flush();
		sc.close();
	}
}