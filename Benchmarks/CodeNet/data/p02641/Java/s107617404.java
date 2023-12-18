import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AForbiddenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int n = scn.nextInt();
		int i = 0 ; 
		while(i < n ) {
			int y = scn.nextInt();
			set.add(y);
			i++;
		}
		
		System.out.println(LeastNumber(set , x));

	}
	public static int LeastNumber(Set<Integer> set , int k) {
		
		int count = 1;
		boolean flag = false;
		
		if(set.isEmpty()) {
			return k;
		}
		
		while(!flag) {
			int min = k - count;
			if(!set.contains(min)) {
				return min;
			}
			int plus = k + count;
			if(!set.contains(plus)) {
				return plus;
			}
			
			count++;
		}
		
		
		return 0;
		
		
	}

}
