import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int ans = Integer.MAX_VALUE;
		if(x<=y)
			ans = Math.min(ans, y-x);
		if(-x<=y)
			ans = Math.min(ans, y+x+1);
		if(x<=-y)
			ans = Math.min(ans, -y-x+1);
		if(-x<=-y)
			ans = Math.min(ans, -y+x+2);
		
		System.out.println(ans);
		
		sc.close();
	}
}
