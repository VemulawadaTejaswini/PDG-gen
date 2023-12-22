import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();

	int[] B = new int[N-1];

	for(int i=0; i<N-1; i++){

	B[i] = sc.nextInt();	

  }

	int[] A = new int[N];

	for(int i=0; i<N-2; i++){

	if(B[i]==B[i+1]){	

	A[i+1] = B[i];

  }	

	else if(B[i]<B[i+1]){

	A[i+1] = B[i];

  }  

	else if(B[i]>B[i+1]){

	A[i+1] = B[i+1];

  }

 }

	A[0] = B[0];

	A[N-1] = B[N-2];

	int ans = 0;

	for(int i=0; i<N; i++){

	ans += A[i];

   }

	System.out.println(ans);

 }
}