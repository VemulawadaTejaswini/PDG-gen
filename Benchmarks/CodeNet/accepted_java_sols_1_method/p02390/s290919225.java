import java.util.Scanner;

public class Main{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	
	int sc = scan.nextInt();
	int h = sc/3600;
	int m = (sc%3600)/60;
	int s = sc%60;

	System.out.printf("%d:%d:%d\n",h,m,s);
	}
}
