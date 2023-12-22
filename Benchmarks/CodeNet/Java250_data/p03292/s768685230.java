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
		long k = sc.nextLong();
		//long l = sc.nextLong();
		long count=0;
		long[] array=new long[3];
		array[0] = n;
		array[1] = m;
		array[2] = k;

		/*for(int i=0;i<=3;i++) {
			if(s.substring(i,i+1).equals("+")) {
				count++;
			}else {
				count--;
			}
		}*/
		Arrays.sort(array);
		/*if() {
			System.out.println(n);
		}else{
			System.out.println(n*2);
		}*/
		//System.out.println((int)Math.ceil((n+m)/2.0));
		System.out.println(Math.abs(array[2]-array[1])+Math.abs(array[1]-array[0]));
	}
}


