import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	//配列の要素数
	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	
	//配列の要素
	int A[] = new int[n];	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<A.length;i++){
	    A[i]= sc.nextInt();
	}
	Sort(A,n);
	Print(A);
    }
    //並べ替え
    private static void Sort(int A[], int n){
	for(int i=1; i < n; i++){
	    int v = A[i];
	    int j = i-1;
	    Print(A);
	    while(j >= 0 && A[j] > v){
		A[j+1] = A[j];
		j--;
	    }                                            
	    A[j+1] = v;
	}
    }
    //表示
    private static void Print(int A[]){
	for(int k=0;k<A.length;k++){
	    if(k>0){
		System.out.print(A[k]);
	    }}
	System.out.println();
    }
}

