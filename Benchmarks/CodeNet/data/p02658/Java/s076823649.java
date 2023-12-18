import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long num[]=new long[N];
		for(int i=0;i<N;i++) {
			num[i]=sc.nextLong();
		}
		sc.close();
		long border=1000000000000000000l;
		long result=1l;
		for(int i=0;i<N;i++) {
			if(num[i]==0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		for(int i=0;i<N;i++) {
			if(result>border/num[i]) {
				System.out.println(-1);
				System.exit(0);
			}else {
				result*=num[i];
			}
		}
		System.out.println(result);
	}
}