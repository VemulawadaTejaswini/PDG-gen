import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
  	int ANS = 0;
  	int[] A = new int[N];
    int[] B = new int[N-1];
	for (int k=0;k<N-1;k++){
      B[k] = sc.nextInt();
    }
  	
  	A[0] = B[0];
  	A[N-1] = B[N-2];
  	for(int i=1;i<N-1;i++){
      	if(B[i]<B[i-1]){
          	A[i] = B[i];
        }else{
          	A[i] = B[i-1];
        }
    }
  	//System.out.println("A = " + Arrays.toString(A));     
  
  	for(int j=0;j<N;j++){
      ANS += A[j];
    }
  		System.out.println(ANS);

	}
}