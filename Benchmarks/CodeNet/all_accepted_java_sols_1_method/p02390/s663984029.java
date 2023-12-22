import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		
		int S, s, m, h;
		S = sin.nextInt();
		s = S % 60 ;
		h = (int)(S / 3600);
		m = (int)((S / 60) - (60 * h)) ;
		System.out.println(h +":"+ m + ":" + s);
	}
}
