import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long k = scan.nextLong();
		long d = scan.nextLong();

		if(x < 0){
			if(-x/d > k){
				System.out.print(x+d*k);
				return;
			}else{
				k -= -x/d;
				x += d*(-x/d);
				if(k%2 == 0){
					System.out.print(x);
				}else{
					System.out.print(Math.min(Math.abs(x+d),(Math.abs(x-d))));
				}
			}
		}else{
			if(x/d > k){
				System.out.print(x-d*k);
				return;
			}else{
				k -= x/d;
				x -= d*(x/d);
				if(k%2 == 0){
					System.out.print(x);
				}else{
					System.out.print(Math.min(Math.abs(x+d),(Math.abs(x-d))));
				}
			}
		}
	}
}
