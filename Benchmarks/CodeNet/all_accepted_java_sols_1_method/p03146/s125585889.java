import java.util.HashSet;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		
		HashSet<Integer> hs = new HashSet<>();
		int a1 = s;
		hs.add(s);
		int m = 1;
		boolean found = false;
		
		while(found == false) {
			if((a1 % 2 == 0)) {
				a1 = a1 / 2;
			}else {
				a1 = 3 * a1 + 1;
			}
			
			m++;
			
			if(hs.contains(a1)) {
				System.out.println(m);
				found = true;
			}
			
			hs.add(a1);
		}
		
	}
	
}