import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int K = sc.nextInt();
      	if(K>100) K=100;
     	Integer A[] = new Integer[N];
      	Integer ans[] = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
          	ans[i] = 1;
        }
      
      	for(int con=0; con<K; con++){
          for(int i=0; i<N;i++){
            int sta = 0;
            int end = N-1;
            if(i-A[i]>0) sta=i-A[i];
            if(i+A[i]<N-1) end=i+A[i];
            for(int j=sta;j<=end;j++) {
            	if(j != i) ans[j] += 1;
            }
          }
          //System.out.println(Arrays.asList(ans));
          for (int i=0; i<N; i++) {
            A[i] = ans[i];
            ans[i] = 1;
          }
        }  
          
      	//System.out.println(Arrays.asList(A));
      	for (int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
      	
    }
}