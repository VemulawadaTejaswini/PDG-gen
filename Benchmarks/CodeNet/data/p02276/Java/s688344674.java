import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//数列Aの長さ決定
	int N = sc.nextInt();
	int[] A = new int[N];
	for(int i = 0;i < N;i++){
	    A[i] = sc.nextInt();
	}
	int q = partition(A,0,N-1);
	System.out.print(A[0]+" ");
	for(int j = 1;j < N-1;j++){
	    if(j == q) {
		System.out.print("[");
		System.out.print(A[q]);
		System.out.print("] ");
	    }else{
		System.out.print(A[j]);
		System.out.print(" ");
	    }
	}
	System.out.println(A[N-1]);
	
    }
    public static int partition(int[] A,int p,int r){
	int temp1,temp2;
	int x = A[r];
	int i = p-1;
	for(int j = p;j <= r-1;j++){
	    if(A[j] <= x){
		//A[r]の値より小さかったらA[i]とA[j]を交換
		i = i+1;
		temp1 = A[i];
		A[i] = A[j];
		A[j] = temp1;
	    }
	    
	}
	temp2 = A[i+1];
	A[i+1] = A[r];
	A[r] = temp2;
	
	return i+1;

    }
    
}

