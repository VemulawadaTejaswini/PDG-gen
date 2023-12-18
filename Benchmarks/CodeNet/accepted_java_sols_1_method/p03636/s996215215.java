import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strs = sc.next();
		String mid = String.valueOf(strs.length()-2);
		String ans=strs.charAt(0)+mid+strs.charAt(strs.length()-1)	;

		
		
		System.out.println(ans);	
		}
	}
