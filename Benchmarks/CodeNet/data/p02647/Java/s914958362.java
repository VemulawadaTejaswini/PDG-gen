import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int K = sc.nextInt();
     	Integer A[] = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

      	Integer ans[] = new Integer[N];
      	for (int i=0; i<N; i++) {
            ans[i] = 1;
        }
      
      	for(int con=0; con<K; con++){
          for(int i=0; i<N;i++){
            for(int j=0; j<N;j++){
              if(i < j){
                if(j - A[j] <= i) ans[i] += 1;
              } else if(i > j){
                if(j + A[j] >= i) ans[i] += 1;
              }
            }
          }
          for (int i=0; i<N; i++) {
            A[i] = ans[i];
          }
          for (int i=0; i<N; i++) {
            ans[i] = 1;
       	  }
        }  
          
      	//System.out.println(Arrays.asList(A));
      	for (int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
      	
    }
}