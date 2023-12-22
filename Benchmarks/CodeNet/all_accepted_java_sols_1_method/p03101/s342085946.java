import java.util.*;
public class Main {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int gyou = sc.nextInt();
		int retu = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int all = gyou * retu;
		int black = (h * retu) + ((gyou - h) * w);
		
		System.out.println(all - black);

	}
	
}