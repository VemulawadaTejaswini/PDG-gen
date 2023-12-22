import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x, y;
		int max, min, mod;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(y > 0){
			max = Math.max(x, y);
			min = Math.min(x, y);
			mod = max % min;
			
			x = min;
			y = mod;
		}
		
		System.out.println(x);
	}
}