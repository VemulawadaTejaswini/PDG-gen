import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		//String g = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();
		//long k = sc.nextLong();
		//long l = sc.nextLong();
		//String buff="Christmas";
		long count=0;
		long[] array=new long[3];

		/*for(long i=n;i<25;i++) {
			buff+=" Eve";
		}*/
		Arrays.sort(array);
		/*if(n==3||n==5||n==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}*/
		System.out.println(1.0*n/m);
		//System.out.println(Math.abs(array[2]-array[1])+Math.abs(array[1]-array[0]));
	}
}


