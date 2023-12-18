import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		
		int x, y, tmp, rest;
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x < y){
			
			tmp = x;
			x = y;
			y = tmp;
			
		}
		
		for(;;){
			
			if(x == y){
				break;
			}
			
			rest = x % y;
			x = y;
			y = rest;
			
			if(x % y == 0) break;
		}
		if(x == y){
			System.out.println(x);
		}else{
			System.out.println(y);
		}
	}
}