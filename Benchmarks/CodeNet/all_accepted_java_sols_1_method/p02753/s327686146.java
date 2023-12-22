import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		System.out.println(a.replace("AAA", "").length() == 0 || a.replace("BBB", "").length() == 0 ? "No" : "Yes");
	}
}
