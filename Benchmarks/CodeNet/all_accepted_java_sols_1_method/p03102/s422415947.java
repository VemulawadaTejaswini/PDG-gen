import java.util.*;

public class Main{
    public static void main(String args[]){ 

	Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int M = scn.nextInt();
    int C = scn.nextInt();
      
  	int[][] A = new int[N][M];
    int[] B = new int[M];
    int[] ans = new	int[N];
    int count =0;

    for(int k=0;k<M;k++){
    	B[k] = scn.nextInt();
    }
    for(int m=0;m<N;m++){
    	ans[m] +=C;
    }
      
	for(int i=0;i<N;i++){
    	for(int j=0;j<M;j++){
        A[i][j]=scn.nextInt();
        ans[i] += A[i][j]*B[j];
        }
    }
    
    for(int m=0;m<N;m++){
    	if(ans[m]>0){
        count++;
        }
    }

      System.out.print(count);

    }
}