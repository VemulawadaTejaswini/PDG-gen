import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
	String S =sc.next();
	if(S.charAt(2)==S.charAt(3)&&S.charAt(4)==S.charAt(5)) {
		p("Yes");
	}else {
		p("No");
	}
	
	}
}