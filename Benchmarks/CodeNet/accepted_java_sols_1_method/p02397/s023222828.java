import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner a = new Scanner (System.in);
		
		int t;
		
		while (true){
			int x = a.nextInt();
			int y = a.nextInt();
			
			if (x + y == 0){
				break;
			}
			if (x > y){
				t = x;
				x = y;
				y = t;
			}
			
			System.out.println(x + " " + y);
		}
	}
}