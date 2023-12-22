
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num;
		while(true){
			if(x>y){
				num = y;
				y = x;
				x = num;
			}else if(x<y || x == y){
				System.out.println(x+" "+y);
				x = sc.nextInt();
				y = sc.nextInt();
				if(x == 0 && y == 0){
					break;
				}
			}
		}
	}
}