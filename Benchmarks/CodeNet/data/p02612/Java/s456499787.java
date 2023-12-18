import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main{
	public static long mod(long x, long e, long m){
		String bi = Long.toBinaryString(e);
		long y = 1;
		for(int i = 0; i < bi.length(); i++){
			if(bi.charAt(i) == '1'){
				y = (y*y*x)%m;
				System.out.println(y);
			}else{
				y = (y*y)%m;
				System.out.println(y);
			}
		}
		return y;
	}
    
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= 10; i++){
			if(1000*i-N >= 0){
				min = Math.min(min, 1000*i-N);
			}
		}
		System.out.println(min);
		
	}
} 