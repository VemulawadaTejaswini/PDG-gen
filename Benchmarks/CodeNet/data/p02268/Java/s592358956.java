import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n,q;
	int C=0;
	int[] S,T;
	int left,mid,right;
	
	public void input() {
		n = sc.nextInt();
		S = new int[n];
		for(int i=0; i<n; i++) S[i] = sc.nextInt();
		q = sc.nextInt();
		T = new int[q];
		for(int i=0; i<q; i++) T[i] = sc.nextInt();
	}
	
	public void search() {
		for(int i=0; i<q; i++) {
			left = 0;
			right = S.length;
			while(left < right) {
				mid = (left + right) / 2;
				if(T[i] == S[mid]) {
					C++;
					break;
				}else if(T[i] > S[mid]) {
					left = mid +1;
				}else {
					right = mid;
				}
			}
		}
		System.out.println(C);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.search();
	}
}

