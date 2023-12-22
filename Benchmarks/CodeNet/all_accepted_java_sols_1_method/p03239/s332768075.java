import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList route = new ArrayList();
		
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int cost = scan.nextInt();
			int time = scan.nextInt();
			
			if(time <= t) {
				route.add(cost);
			}
		}
		
		if(route.size() == 0) {
			System.out.println("TLE");
		}else {
			route.sort(null);
			System.out.println(route.get(0));
		}
		
	}

}