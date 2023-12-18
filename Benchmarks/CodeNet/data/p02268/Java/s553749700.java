import java.util.*;

class Main{
	
	int n, q;int count=0;int j, L, R, mid;
	int[] S ;int[] T;
	Scanner sc = new Scanner(System.in);
	
	void input(){
		n = sc.nextInt();
		S = new int[n];
		for(int i=0; i<n; i++)S[i] = sc.nextInt();
		q = sc.nextInt();
		T = new int[q];
		for(int j=0; j<q; j++)T[j] = sc.nextInt();
		search();
		output();
	}
	void search(){
		for(j=0; j<q; j++){
			L=0; R=n;
			midd();
		}
	}
	void midd(){
		while(L!=R){
			mid=(L+R)/2;
			if(S[mid]==T[j]){
				count++;
				L=R;
			}else{
				if(S[mid]>T[j]){
					R=mid;
				}else{
					L=mid+1;
				}
			}
		}
	}

	void output(){
		System.out.println(count);
	}
	
	public static void main(String[] args){
		new Main().input();
	}
}