import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y=s.nextInt();
		int are=x*y;
		int len=2*x+2*y;
		System.out.println(are+" "+len);
	}
}