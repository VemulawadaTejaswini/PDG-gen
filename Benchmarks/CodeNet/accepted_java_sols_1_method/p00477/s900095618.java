import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			sum+=sc.nextInt();
		}
		
		int x = 0, y = 0;
		
		while(sum > 0) {
			if(sum >= 60) {
				sum-=60;
				x++;
			} else {
				sum--;
				y++;
			}
		}
		
		System.out.println(x);
		System.out.println(y);
	}
}