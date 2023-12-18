import java.util.*;

class ALDS1_4_A_LinearSearch{
	
	int n, q;int count=0;
	int[] S ;int[] T;
	Scanner sc = new Scanner(System.in);
	
	void input(){
		n = sc.nextInt();
		S = new int[n];
		for(int i=0; i<n; i++){
			S[i] = sc.nextInt();
		}
		q = sc.nextInt();
		T = new int[q];
		for(int j=0; j<q; j++){
			T[j] = sc.nextInt();
		}
		search();
	}
	void search(){
		for(int i=0; i<q; i++){
			for(int j=0; j<n; j++){
				if(S[i]==T[j]){
					count=count+1;
					j=n;
				}
			}
		}
		output();
	}
	void output(){
		System.out.println(count);
	}
	
	public static void main(String[] args){
		new ALDS1_4_A_LinearSearch().input();
	}
}