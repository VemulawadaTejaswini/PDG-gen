import java.util.*;

public class Main {
	public static void main(String[] args){
		int change;
		Scanner sc = new Scanner(System.in);

		for(;;){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == 0 && y == 0)
				break;
			
			if(x > y){
				change = x;
				x = y;
				y = change;
			}
			
			System.out.println(x +" "+y);
		}
	}
}