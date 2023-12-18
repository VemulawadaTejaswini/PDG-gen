import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		int cnt=0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(A[i]>A[j]){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}