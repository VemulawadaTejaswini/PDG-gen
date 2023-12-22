import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A=new int[N+1];
		
		for(int i=0;i<N+1;i++) {
			A[i]=0;
		}
		
		for(int i=1;i<K+1;i++) {
			int d=sc.nextInt();
			for(int j=0;j<d;j++) {
				int l=sc.nextInt();
				A[l]++;
			}
		}
		
		int count=0;
		
		for(int k=1;k<N+1;k++) {
			if(A[k]==0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
