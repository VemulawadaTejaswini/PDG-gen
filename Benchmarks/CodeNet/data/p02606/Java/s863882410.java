import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int L = Integer.valueOf(s.next());
		int R = Integer.valueOf(s.next());
		int d = Integer.valueOf(s.next());
		
		int ret = 0;
		for(int i = L; i <=R; i++) {
			if(i % d == 0) {
				ret++;
			}
		}
		
		System.out.println(ret);
	}
}