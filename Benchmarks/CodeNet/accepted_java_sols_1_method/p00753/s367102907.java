import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] prime = new int[123456*2];
		int end=(int)Math.sqrt((double)123456*2);
		for(int i=4;i<123456*2;i+=2) {
			prime[i-1]=-1;
		}
		for(int i=3;i<=end;i+=2) {
			if(prime[i-1]==0) {
				for(int j=i+i;j<=123456*2;j+=i) {
					prime[j-1]=-1;
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int count=0;
			for(int i=n+1;i<=2*n;++i) {
				if(prime[i-1]==0) count++;
			}
			System.out.println(count);
		}
	}
}

