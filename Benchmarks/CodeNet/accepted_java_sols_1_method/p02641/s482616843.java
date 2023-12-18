import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int N = s.nextInt();
		boolean[] p = new boolean[200];
		for(int i = 0; i < N; i++) {
			p[s.nextInt()] = true;
		}
		int plus = 1;
		int minus = 1;
		
		if(!p[X]) {
			System.out.println(X);
			return;
		}
		
		while(true) {
			if((X-minus >= 0 && !p[X-minus]) || X-minus < 0) {
				System.out.println(X-minus);
				return;
			}else {
				minus++;
			}
			if(!p[X+plus]) {
				System.out.println(X+plus);
				return;
			}else {
				plus++;
			}
		}
	}
}