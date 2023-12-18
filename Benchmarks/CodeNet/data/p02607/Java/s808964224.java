import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		
		int ret = 0;
		for(int i = 1; i <= N; i++) {
			int cur = Integer.valueOf(s.next());
			if(cur%2 == 1 && i % 2 == 1) {
				ret++;
			}
		}
		System.out.println(ret);
	}
}