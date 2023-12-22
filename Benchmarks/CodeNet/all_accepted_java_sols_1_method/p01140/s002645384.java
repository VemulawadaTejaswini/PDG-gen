import java.util.Scanner;

public class Main {public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				int M=sc.nextInt();
				if(N+M==0) break;
				int[] h=new int[N+2];
				int[] w=new int[M+2];
				for(int i=1; i<=N; i++) {
					h[i]=sc.nextInt();
				}
				for(int i=1; i<=M; i++) {
					w[i]=sc.nextInt();
				}
				int[] hnum=new int[1500010];
				int[] wnum=new int[1500010];
				int sum=0;
				for(int i=1; i<=N; i++) {
					sum=0;
					for(int j=i; j<=N; j++) {
						sum+=h[j];
						hnum[sum]++;
					}
				}
				for(int i=1; i<=M; i++) {
					sum=0;
					for(int j=i; j<=M; j++) {
						sum+=w[j];
						wnum[sum]++;
					}
				}
				sum=0;
				for(int i=1; i<=1500000; i++) {
					sum+=hnum[i]*wnum[i];
				}
				System.out.println(sum);
			}
			
		}
	}
}
