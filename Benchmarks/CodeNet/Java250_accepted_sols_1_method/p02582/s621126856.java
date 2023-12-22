import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a=1;
		
		
			if((s.charAt(0)=='S')&&(s.charAt(1)=='S')&&(s.charAt(2)=='S')) {
			 a=0;
			}
			else if((s.charAt(0)=='R')&&(s.charAt(1)=='R')&&(s.charAt(2)=='R')) {
				 a=3;
			}
			else if((s.charAt(0)=='R')&&(s.charAt(1)=='R')&&(s.charAt(2)=='S')) {
				 a=2;
			}
			else if((s.charAt(0)=='R')&&(s.charAt(1)=='S')&&(s.charAt(2)=='R')) {
				 a=1;
			}
			else if((s.charAt(0)=='S')&&(s.charAt(1)=='R')&&(s.charAt(2)=='R')) {
				 a=2;
			}
			else if((s.charAt(0)=='S')&&(s.charAt(1)=='S')&&(s.charAt(2)=='R')) {
				 a=1;
			}
		
	
		System.out.println(a);
		sc.close();
	}

}