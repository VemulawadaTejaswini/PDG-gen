import java.util.*;

public class Main {

    public static void main(String[] args) {

    	//input
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();

    	int[] A = new int[N];

        for(int i = 0; i < N; i++){
        	A[i] = sc.nextInt();
        }
        
        int result = Partition(A,0,N-1);
//        System.out.println(result);
    }

    //calculation
    public static int Partition(int[] A,int p, int r){
    	int x = A[r]; //x??????????????????A[r]???temporary??即???????????即???
    	int i = p - 1;//i????????????????????????????????????????????????????属????????????????????????????????????????
    	
//    	System.out.println("r="+r);
    	
    	for(int j = p; j<r+1; j++){
    		if(A[j]<=x){
    			i++;
    			int temp = A[i];
    			A[i] = A[j];
    			A[j] = temp;
    		} else {
    			int temp = A[i+1];
    			A[i+1] = A[r];
    			A[r] = temp;
    		}
//    		if(j == r){
//    			int temp = A[i+1];
//    			A[i+1] = A[r];
//    			A[r] = temp;
//    		}
    	}
		for(int k = 0 ;k < r+1;k++){
			if( A[k] == x){
				System.out.print("[" + x + "] ");
				continue;
			}
			System.out.print(A[k]);
			if(k < r){
				System.out.print(" ");
			}
		}
//    		System.out.print("  i = " + i);
//    		System.out.print("  j = " + j);
    		System.out.println();
    		
/*    		for(int m = 0; m < r; m++){
    			if(m == i+1){
    				System.out.print("i" );
    			}else if(m == j){
    				System.out.print("j" );
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
 */   	
    	return i;
    }
/*
    {
    //output
     for(int i = 0; i < N; i++){
    	System.out.print(Out_ar[i]);
    }
	if(i < N - 1){
		System.out.print(" ");
    	}
    }
    System.out.println();
} */
}