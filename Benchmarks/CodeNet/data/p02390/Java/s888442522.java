import java.util.Scanner;


public class Main {
	public static void main(String[]args){
		
		//????????£????????????
		Scanner S = new Scanner(System.in);
		
		
		//int h = 46979; //?????? 
		int h = S.nextInt();
		h = h / 60 / 60; 
		
		
		//int m = 46979; //???
		int m = S.nextInt();
		m = m % 360 / 60;
		
		
		//int s = 46979; //?§?
		int s = S.nextInt();
		s = s % 60;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}