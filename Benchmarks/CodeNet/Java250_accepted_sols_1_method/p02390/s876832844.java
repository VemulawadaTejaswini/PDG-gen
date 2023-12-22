import java.util.*;

class Main{
	public static void main(String args[]){
		final int hTos = 3600, mTos = 60;
		Scanner sc = new Scanner(System.in);
		int S, h, m, s;
		
		S = sc.nextInt();
		
		h = S / hTos;
		int a = S % hTos;
		
		m = a / mTos;
		s = a % mTos;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}