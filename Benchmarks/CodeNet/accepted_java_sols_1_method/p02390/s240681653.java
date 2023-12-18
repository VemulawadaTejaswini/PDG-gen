import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		java.util.Scanner sin = new java.util.Scanner(System.in);
		int S = sin.nextInt();
		int a,b,c,h,m,s;
		if(0 <= S && S < 86400){
			h = S / 3600;
			a = S % 3600;
			m = a / 60;
			s = a % 60;
			System.out.println(h + ":" + m + ":" + s);
		}
	}
}
