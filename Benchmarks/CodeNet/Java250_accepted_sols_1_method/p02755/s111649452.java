
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
	;
		int max = (int) Math.max(a,b);
		int ans= -1;
		for(int i = max ; i < 10001 ;i ++) {
			if(Math.floorDiv(i*2, 25) == a && Math.floorDiv(i, 10) == b ) {
				ans = i;
				break;
			}
			}
		System.out.println(ans);
	}
	
}
