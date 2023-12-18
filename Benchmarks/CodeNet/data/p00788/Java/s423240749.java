import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y){
		if(x == 0){
			return y;
		}else{
			return gcd(y % x, x);
		}
	}


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int p = sc.nextInt();
			final int n = sc.nextInt();
			
			if(p == 0 && n == 0){
				break;
			}
			
			final double ans = Math.sqrt(p);
			double less = Double.MIN_VALUE;
			double more = Double.MAX_VALUE;
			int less_u = 1, less_v = 1, more_x = 1, more_y = 1;
			
			for(int a = 1; a < n; a++){
				for(int b = 1; b < n; b++){
					final int gcd = gcd(a, b);
					final int a_ = a / gcd;
					final int b_ = b / gcd;
					
					double raito = (double)(a_) / b_;
					
					if(ans < raito){
						if(more > raito){
							more = raito;
							more_x = a_;
							more_y = b_;
						}
					}else if(ans > raito){
						if(less < raito){
							less = raito;
							less_u = a_;
							less_v = b_;
						}
						
					}
					
				}
			}
			
			System.out.println(more_x + "/" + more_y + " " + less_u + "/" + less_v);
			
		}
	}

}