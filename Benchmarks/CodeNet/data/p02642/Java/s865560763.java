import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      
      	Integer A[] = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
		
      	Arrays.sort(A, Collections.reverseOrder());
      	int ans = 0;
		for(int i = 0;i<N-1;i++){
          for(int j = i+1;j<N;j++){            
            if(A[i] % A[j] == 0) {
              ans += 1;
              break;
         	}
          }
        }
      	if(A[N-1] % A[N-2] == 0) {
              ans += 1;
        }
        
        System.out.println(N - ans);
    }
}