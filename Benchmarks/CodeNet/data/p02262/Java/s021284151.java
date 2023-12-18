import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		int i;
		for(i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		shellSort(A, n);
		for(i=0; i<n; i++){
			System.out.println(A[i]);
		}
	}
	static void shellSort(int A[], int n){
		int G[] = new int[15];
		int i, j, m=0, cnt=0;
		for(i=1; i<n/9; i=i*3+1){
			for(j=m; j>0; j--){
				G[j] = G[j-1];
			}
			G[0] = i;
			m++;
		}
		if(m==0){
			G[0] = 1;
			m=1;
		}
		System.out.println(m);
		for(i=0; i<m; i++){
			if(i!=0) System.out.print(" ");
			System.out.print(G[i]);
			cnt += insertionSort(A, n, G[i]);
		}
		System.out.println();
		System.out.println(cnt);
	}
	static int insertionSort(int A[], int n, int g){
		int i, j, key, cnt=0;
		for(i=g; i<n; i++){
			key = A[i];
			j = i - g;
			while(j>=0 && A[j]>key){
				A[j+g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j+g] = key;
		}
		return cnt;
	}
}