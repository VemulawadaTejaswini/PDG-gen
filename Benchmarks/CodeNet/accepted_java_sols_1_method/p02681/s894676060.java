import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(s.charAt(0) == t.charAt(0) && t.replaceFirst(s, "").length() == 1 ? "Yes" : "No");
	}
}
