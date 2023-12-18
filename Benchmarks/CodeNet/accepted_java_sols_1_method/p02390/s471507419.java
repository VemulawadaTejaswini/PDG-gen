import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int time_sec = new Integer(S);
		
		int time_min = time_sec/60;
		int s =time_sec%60;
		
		int h =time_min/60;
		int m =time_min%60;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}