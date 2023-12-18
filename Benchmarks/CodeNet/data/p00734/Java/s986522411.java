import java.io.*;
import java.util.*;

public class Main{
    public static void swap(int[] A, int[] B, int gap_a2b){
    	boolean swapable= false;
		Arrays.sort(A);
		Arrays.sort(B);
    	if( A.length < B.length ){
    		for(int i=0;i<A.length;i++){
    			if( Arrays.binarySearch(B, A[i]+gap_a2b/2) >= 0 ){
    				System.out.println( A[i]+" "+(A[i]+gap_a2b/2) );
    				swapable= true;
    				break;
    			}
    		}
    		if( !swapable ){ System.out.println(-1); }
    	} else{
    		for(int i=0;i<B.length;i++){
    			if( Arrays.binarySearch(A, B[i]-gap_a2b/2) >= 0 ){
    				System.out.println( (B[i]-gap_a2b/2)+" "+B[i] );
    				swapable= true;
    				break;
    			}
    		}
    		if( !swapable ){ System.out.println(-1); }
    	}
    }
    
    public static void main(String args[]) throws Exception{
        Scanner sc= new Scanner(System.in);
        int Na,Nb;
        int sum_a,sum_b;
        while( (Na= sc.nextInt())>0 && (Nb= sc.nextInt())>0 ){
        	int[] A= new int[Na];
        	int[] B= new int[Nb];
        	sum_a= sum_b= 0;
        	
        	int i;
        	for(i=0;i<Na;i++){
        		A[i]= sc.nextInt();
        		sum_a += A[i];
        	}
        	for(i=0;i<Nb;i++){
        		B[i]= sc.nextInt();
        		sum_b += B[i];
        	}
        	
        	int gap_a2b= sum_b-sum_a;
        	if( gap_a2b %2 == 0 ){
        		swap(A,B,gap_a2b);
        	} else{ System.out.println(-1); }
        }
    }
}