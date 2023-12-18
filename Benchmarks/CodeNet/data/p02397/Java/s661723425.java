
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int num;
			if(x>y){
				num = y;
				y = x;
				x = num;
				System.out.println(x+" "+y);
				if(x == 0 && y == 0){
					break;
				}
			}
		}
	}
}