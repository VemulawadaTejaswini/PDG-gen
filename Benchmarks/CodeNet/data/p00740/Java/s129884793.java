import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==0 || p==0) {
				break;
			}
			
			int[] point = new int[p];
			int target = 0;
			int bowl = n;
			
			for(;;) {
				if(bowl != 0) {
					point[target] ++;
					bowl --;
				} else {
					bowl = point[target];
					point[target] = 0;
				}
				
				if(point[target] == n) {
					break;
				} else {
					if(target == p-1) {
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