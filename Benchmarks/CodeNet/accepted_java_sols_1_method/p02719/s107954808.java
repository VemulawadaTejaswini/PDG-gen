import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		long N = cin.nextLong();
		long K = cin.nextLong();
		
		long min = N;
		
		if(N<K) {
			if(min>Math.abs(min-K)) min = Math.abs(min-K);
		}
		else {
			if(N%K==0) {
				min = 0;
			}else{
				min = N%K;
				if(min>Math.abs(min-K)) min = Math.abs(min-K);
			}
		}
		
		System.out.println(min);

	}

}
