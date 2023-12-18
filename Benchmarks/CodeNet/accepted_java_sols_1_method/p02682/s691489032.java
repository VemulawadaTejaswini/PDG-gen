import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<A;i++) {
			if(K>0) {
				sum+=1;
				K-=1;
			}
		}
		for(int i=0;i<B;i++) {
			if(K>0) {
				K-=1;
			}
		}
		for(int i=0;i<C;i++) {
			if(K>0) {
				sum-=1;
				K-=1;
			}
		}
		System.out.println(sum);
		
	}
}
