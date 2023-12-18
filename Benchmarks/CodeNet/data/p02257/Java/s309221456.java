import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),cnt=0;
		for(int i=0;i<n;i++) {
			if(solve(Integer.parseInt(in.next())))cnt++;
		}
		System.out.println(cnt);
	}
	
	static boolean solve(int a) {
		boolean A[]=new boolean[a+1];
		for(int i=0;i<A.length;i++)A[i]=true;
		sieve(A);
		if(A[a])return true;
		else return false;
	}
	
	static void sieve(boolean[] A) {
		for(int i=2;i<Math.sqrt(A.length);i++) {
			if(A[i]) {
				int p=i,s=p*2;
				for(int j=s;j<A.length;j+=p)A[j]=false;
			}
		}
	}

}
