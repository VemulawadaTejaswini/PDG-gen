import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for(int i=0; i<n; i++) S[i] = sc.nextInt();
		int q = sc.nextInt();
		int[] T = new int[q];
		for(int i=0; i<q; i++) T[i] = sc.nextInt();
		int ans = 0;
		for(int i=0; i<q; i++) {
			if(binarySearch(S, T[i])!=-1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	static int binarySearch(int[] A, int x) {
		int l = 0;
		int r = A.length;
		while(l<r) {
			int mid = (l+r)/2;
			if(A[mid] == x) return mid;
			else if(x<A[mid]) r = mid;
			else l = mid+1;
		}
		return -1;
	}

}