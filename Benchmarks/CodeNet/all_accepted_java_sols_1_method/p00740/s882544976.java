import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, p, target, bowl;
		int[] point;
		
		while(true) {
			n = sc.nextInt();
			p = sc.nextInt();
			if(n==0 || p==0) {
				break;
			}
			
			point = new int[n];
			target = 0;
			bowl = p;
			
			for(;;) {
				if(bowl != 0) {
					point[target] ++;
					bowl --;
				} else {
					bowl = point[target];
					point[target] = 0;
				}
				
				if(point[target] == p) {
					break;
				} else {
					if(target == n-1) {
						target = 0;
					} else {
						target ++;
					}
				}
			}
			System.out.println(target);
		}
		
	}
}