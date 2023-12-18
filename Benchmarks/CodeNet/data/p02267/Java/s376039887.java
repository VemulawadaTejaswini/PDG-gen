import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n,q;
	int[] S,T;
	int C=0;
	
	public void input(){
		n = sc.nextInt();
		S = new int[n];
		for(int i=0; i<n; i++){
			S[i] = sc.nextInt();
		}
		q = sc.nextInt();
		T = new int[q];
		for(int i=0; i<q; i++){
			T[i] = sc.nextInt();
		}
	}
	
	public void search(){
		for(int i=0; i<q; i++){
			for(int j=0; j<n; j++){
				if(T[i] == S[j]) C++;
			}
		}
		System.out.println(C);
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
		obj.search();
	}
}

