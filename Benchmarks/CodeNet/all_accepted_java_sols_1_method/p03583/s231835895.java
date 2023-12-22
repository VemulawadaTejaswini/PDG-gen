import java.util.Scanner;

/**
 * http://tenka1-2017.contest.atcoder.jp/tasks/tenka1_2017_c
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		sc.close();
		
		long h = -1;
		long n = -1;
		long w = -1;
		for(long x=1; x<=3500; x++){
			for(long y=1; y<=3500; y++){
				long dived = 4*x*y-N*(x+y);
				if(dived==0) continue;
				long z = (N*x*y)/dived;
				if(4*x*y*z==N*(x*y+y*z+z*x) && z >=0){
					h = x;
					n = y;
					w = z;
					break;
				}
			}
			if(h>0) break;
		}
		
		System.out.println(String.format("%d %d %d", h,n,w));

	}

}