import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int s = a%60;
		int m = a/60;
		int h = m/60;
		m = m%60;
		
		System.out.println(h+":"+m+":"+s);
	}
}