import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int d = 0;
		boolean[] have = new boolean[N];
		for(int i = 0; i < K;i++) {
			d = s.nextInt();
			for(int j = 0; j < d; j++) {
				have[s.nextInt() - 1] = true;
			}
		}
		
		int counter = 0;
		for(boolean b : have) {
			if(b)
				continue;
			counter++;
		}
		
		System.out.println(counter);
    }
}