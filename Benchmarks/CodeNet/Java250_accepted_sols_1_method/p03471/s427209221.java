import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long Y = s.nextLong();
		
		for(int man = 0; man < N + 1; man++) {
			for(int gosen = 0; gosen < N + 1; gosen++) {
				if(0 <= Y - man*10000 - gosen*5000 && (Y - man*10000 - gosen*5000)/1000 == (N - man - gosen)) {
					System.out.print(man + " ");
					System.out.print(gosen + " ");
					System.out.println(N - man - gosen);
					return;
				}
			}
		}
		
		System.out.println("-1 -1 -1");
    }
}
