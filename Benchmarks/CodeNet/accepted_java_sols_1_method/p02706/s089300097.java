import java.util.*;

public class Main{
//public class abc163_b{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		int m = scan.nextInt();
		int[] a = new int[m];
		long sum = 0;
		
		for(int i=0; i <m; i++){
			a[i] = scan.nextInt();
			sum += a[i];
		}
		
		if(n >= sum ){
			System.out.println( n-sum );
		}else{
			System.out.println( -1 );
		}
	}
}