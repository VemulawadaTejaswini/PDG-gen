import java.util.Scanner;

public class Main {
	
	static int n;
	static int[] A;
	static int[] W;
	
	static int merge(int l, int r) {
		if(l+1>=r) return 0;
		if(l+2==r) {
			if(A[l]<=A[l+1]) return 0;
			int swap=A[l+1];
			A[l+1]=A[l];
			A[l]=swap;
			return 1;
		}
		int m=(l+r)/2;
		int cl=merge(l, m);
		int cr=merge(m, r);
		int c=0;
		int i=l, j=m, k=l;
		while(i<m && j<r) {
			if(A[i]<=A[j]) {
				W[k++]=A[i++];
				c++;
			}
			else {
				W[k++]=A[j++];
				c+=m-i;
				
			}
		}
		while(i<m) {
			W[k++]=A[i++];
		}
		while(j<r) {
			W[k++]=A[j++];
		}
		for(int x=l; x<r; x++) {
			A[x]=W[x];
		}
		return cl+cr+c;
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			A=new int[n+1];
			W=new int[n+1];
			for(int i=0; i<n; i++) {
				A[i]=sc.nextInt();
			}
			int count=merge(0, n);
			for(int i=0; i<n; i++) {
				if(i>0) System.out.print(" ");
				System.out.print(A[i]);
			}
			System.out.println();
			System.out.println(count-1);


		}
	}
}
