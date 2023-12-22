import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		long ww = sc.nextLong();
		long hh = sc.nextLong();
		long xx = sc.nextLong();
		long yy = sc.nextLong();
		
		System.out.print(ww*hh/2.0);
		System.out.print(" "+(xx*2==ww && yy*2==hh ? 1:0));
		
	}
}