import java.util.*;
 
public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) A[i] = sc.nextInt();
		show(A);
		for(int i=1;i<N;i++){
			int v = A[i];
			int j = i-1;
			while(j>=0 && A[j]>v){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			show(A);
		}

	}
	
	public static void show(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.print(ary[i]+" ");
		}
		cout(ary[ary.length-1]);
	}
	
	public static void cout(String n){
		System.out.println(n);
	}
	
	public static void cout(int n){
		System.out.println(n);
	}
}