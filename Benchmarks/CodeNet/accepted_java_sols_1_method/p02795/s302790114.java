import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		//String g = sc.next();
		long h = sc.nextLong();
		long w = sc.nextLong();
		long n = sc.nextLong();
		//long l = sc.nextLong();
		//String buff="Christmas";
		long countw=0;
		long buff=0;
		long[] array=new long[3];

		for(long i=0;i<Math.max(h, w);i++) {
			buff+=Math.max(w, h);
			if(buff>=n) {
				System.out.println(i+1);
				System.exit(0);
			}
			countw=i+1;
		}
		for(long i=0;i<Math.min(h, w);i++) {
			buff+=Math.min(w, h)-countw;
			if(buff>=n) {
				System.out.println(i+1);
				System.exit(0);
			}
			countw=i+1;
		}
		Arrays.sort(array);

		/*if() {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}*/
		//System.out.println(n*m-k*m-l*(n-k));
		//System.out.println(Math.abs(array[2]-array[1])+Math.abs(array[1]-array[0]));
	}
}


