
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int n =sc.nextInt();
		int min=0;
		int max=0;
		ArrayList p = new ArrayList<>();
		
		if(n==0) {
			System.out.println(x);
			System.exit(0);
		}
		
		for(int i=0;i<n;i++) {
			p.add(sc.nextInt());
		}

		for(int i=1;i<p.size()/2+1;i++) {
			if(!(p.contains(x-i))) {
				System.out.println(x-i);
				System.exit(0);
			}
			else if(!(p.contains(x+i))) {
				System.out.println(x+i);
				System.exit(0);
				
			}
		}
		
		sc.close();
	}
}
