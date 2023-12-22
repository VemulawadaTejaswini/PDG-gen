import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int h,m,s;
		int x,y;

		h=S/3600;
		x=S%3600;
		m=x/60;
		y=x%60;
		s=y;

		System.out.println(h + ":" + m + ":" + s);
	}
}
