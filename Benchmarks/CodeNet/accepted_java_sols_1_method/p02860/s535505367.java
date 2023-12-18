import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(s.substring(0, n/2).equals(s.substring(n/2)) ? "Yes" : "No");
	}
}
