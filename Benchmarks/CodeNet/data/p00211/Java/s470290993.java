import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static long lcm(int[] array) {
		int max = Integer.MIN_VALUE;
		
		for(int num : array){
			max = Math.max(max, num);
		}
		
		LOOP:
		for(int div = max; div >= 2; div--){
			
			for(int num : array){
				if(num % div != 0){
					continue LOOP;
				}
			}
			
			for(int i = 0; i < array.length; i++){
				array[i] /= div;
			}
			
			return div * lcm(array);
		}
		
		long pi = 1;
		for(int num : array){
			pi *= num;
		}
		
		return pi;
	}
	
	public static long lcm(long[] array) {
		long max = Long.MIN_VALUE;
		
		for(long num : array){
			max = Math.max(max, num);
		}
		
		//System.out.println("[" + max + "]");
		
		final long ceil = (long) Math.ceil(Math.sqrt(max));
		LOOP:
		for(long div = ceil; div >= 2; div--){
			
			for(long num : array){
				if(num % div != 0){
					continue LOOP;
				}
			}
			
			for(int i = 0; i < array.length; i++){
				array[i] /= div;
			}
			
			return div * lcm(array);
		}
		
		long pi = 1;
		for(long num : array){
			pi *= num;
		}
		
		return pi;
	}
	
	public static int gcd(int x, int y){
		if(x == 0){
			return y;
		}else{
			return gcd(y % x, x);
		}
	}
	
	public static void gcd_a(int[] d, int[] v){
		for(int i = 0; i < d.length; i++){
			int g = gcd(d[i], v[i]);
			d[i] /= g;
			v[i] /= g;
		}
	}
	
	public static boolean all_same_pair(int[] d, int[] v){
		for(int i = 1; i < d.length; i++){
			if(d[0] != d[i] && v[0] != v[i]){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean all_same(int[] d){
		for(int i = 1; i < d.length; i++){
			if(d[i] != d[0]){
				return false;
			}
		}
		
		return true;
	}
	
	public static BigInteger gcd(BigInteger first, BigInteger second){
		return first.gcd(second);
	}
	
	public static BigInteger lcm(BigInteger first, BigInteger second){
		return first.multiply(second).divide(gcd(first, second));
	}
	
	public static BigInteger lcm(BigInteger[] bigs){
		BigInteger big = bigs[0];
		
		for(int i = 1; i < bigs.length; i++){
			big = lcm(big, bigs[i]);
		}
		
		return big;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			
			BigInteger[] dist = new BigInteger[n];
			BigInteger[] velo = new BigInteger[n];
			
			for(int i = 0; i < n; i++){
				dist[i] = new BigInteger(sc.next());
				velo[i] = new BigInteger(sc.next());
			}
			
			BigInteger velo_lcm = lcm(velo);
			
			//System.out.println(velo_lcm);
			
			BigInteger[] dist_norm = new BigInteger[n];
			for(int i = 0; i < n; i++){
				dist_norm[i] = dist[i].multiply(velo_lcm.divide(velo[i]));
			}
			
			//System.out.println("!");
			BigInteger dist_lcm = lcm(dist_norm);
			//System.out.println(dist_lcm);
			//System.out.println("!");
			for(int i = 0; i < n; i++){
				System.out.println(dist_lcm.multiply(velo[i]).divide(velo_lcm).divide(dist[i]));
			}
			
			
		}
	}

}