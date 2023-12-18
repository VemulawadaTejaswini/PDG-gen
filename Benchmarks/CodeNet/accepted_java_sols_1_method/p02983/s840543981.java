import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l=sc.nextLong(),r=sc.nextLong(),min=Long.MAX_VALUE;
		if(l==0 || r-l>=2018) {
			System.out.println(0);
		}else {
			for(long i=l;i<r;i++) {
				if(i%2019==0) {
					System.out.println(0);
					System.exit(0);
				}
				for(long j=l+1;j<=r;j++) {
					min=Math.min(min, (i*j)%2019);
				}
			}
			System.out.println(min);
		}
	}
}

