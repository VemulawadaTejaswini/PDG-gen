
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int m = sc.nextInt();
		
		for(int i = 0; i < m; i++){
			String str = sc.next();
			HashSet<String> set = new HashSet<String>();
			
			for(int j = 1; j < str.length(); j++){
				
				String forward = str.substring(0, j);
				String backward = str.substring(j);
				StringBuilder forward_r = new StringBuilder();
				forward_r.append(forward);
				forward_r.reverse();
				StringBuilder backward_r = new StringBuilder();
				backward_r.append(backward);
				backward_r.reverse();
				
				set.add(forward + backward);
				set.add(forward + backward_r);
				set.add(forward_r + backward);
				set.add(forward_r + "" + backward_r);
				set.add(backward + forward);
				set.add(backward + forward_r);
				set.add(backward_r + forward);
				set.add(backward_r + "" + forward_r);
				
			}
			
			System.out.println(set.size());
		}
		
	}

}