import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int[] A = new int[N];
		
		long ret = 0;
		int cur = s.nextInt();
		int before = 0;
		for(int i = 1 ; i < N ; i++) {
			before = cur;
			cur = s.nextInt();
			if(before > cur) {
				ret += before - cur;
				cur  = before;
			}
		}
		System.out.println(ret);
	}
}