import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int[] ret = new int[N+1];
		
		for(int x = 1; x < 100; x++) {
			for(int y = 1; y < 100; y++) {
				for(int z = 1; z < 100; z++) {
					int cur = calc(x, y, z);
					if(cur <= N) {
						ret[cur]++;
					}else {
						break;
					}
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.println(ret[i]);
		}
		
		
	}
	
	private static int calc(int x, int y, int z) {
		return (x*x + y*y + z*z + x*y + y*z + z*x);
	}
}