import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int s1=0;
		int s2=0;
		int sum=0;
		int min=101;
		int k=0;
		
		for(int i=0;i<N;i++) {
			W[i]=sc.nextInt();
			sum+=W[i];
		}
		
		int j=0;
		
		for(int i=0;i<N;i++) {
			k+=W[i];
			j=sum-k;
			if(Math.abs(j-k)<min) {
				min=Math.abs(j-k);
			}
		}
		
		System.out.println(min);
		sc.close();
	}
}
