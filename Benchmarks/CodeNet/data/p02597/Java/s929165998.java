import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		char[] c = s.next().toCharArray();
		int[] C = new int[N];
		int left_one = N + 1;
		int right_zero = -1;
		for(int i = 0; i < N; i++) {
			if(c[i] == 'W') {
				C[i] = 1;
				left_one = Integer.min(left_one, i);
			}else {
				C[i] = 0;
				right_zero = Integer.max(right_zero, i);
			}
		}
		
		int cnt = 0;
		while(left_one < right_zero) {
			C[left_one] = 0;
			C[right_zero] = 1;
			left_one = nextOne(C, left_one);
			right_zero = nextZero(C, right_zero);
			cnt++;
		}
		System.out.println(cnt);
	}
}