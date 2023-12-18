import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long num[]=new long[N];
		for(int i=0;i<N;i++) {
			num[i]=sc.nextLong();
		}
		sc.close();
		long result=1l;
		try {
			 for(int i=0;i<N;i++) {
					result*=num[i];
					if(result<0l) {
						System.out.println(-1);
						 System.exit(0);
					}
			}
			 if (result < Long.MAX_VALUE&&result<1000000000000000000l)
				 System.out.println(result);
			 else
				 System.out.println(-1);
			 System.exit(0);
	    } catch (Exception e) {
	            System.out.println(-1);
	    }
	}
}