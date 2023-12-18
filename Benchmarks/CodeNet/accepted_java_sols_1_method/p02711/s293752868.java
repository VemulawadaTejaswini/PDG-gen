import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = Integer.toString(n);
		char[] b = a.toCharArray();
		if(b[0]=='7'||b[1]=='7'||b[2]=='7') {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}