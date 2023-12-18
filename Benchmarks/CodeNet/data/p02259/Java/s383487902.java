import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	//配列の要素数
	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

	//配列の要素
	int A[] = new int[n];	
	for(int i=0;i<A.length;i++){
	    A[i]= scanner.nextInt();
	}
	bubbleSort(A,n);
    }
    //並べ替え
    private static void bubbleSort(int A[],int N){
	int flag = 1;
	int count = 0;

	while(flag != 0){
	    flag = 0;
	    for(int j=N-1; j > 0; j--){
		if(A[j] < A[j-1]){
		    int v = A[j];
		    int w = A[j-1];
		    A[j] = w;
		    A[j-1] = v;
		    flag = 1;
		    count++;
		}	
	    }
	}
	Print(A,N);
	System.out.println(count);
    }
    //表示
    private static void Print(int A[], int n){
	for(int k=0;k<A.length;k++){
	    System.out.print(A[k]);
	    if(k < (n-1)){
		System.out.print(" ");
	    }
	}
	System.out.println();
    }
}


