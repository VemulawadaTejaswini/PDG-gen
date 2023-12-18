import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      
      	Integer A[] = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
		
      	int ans = 0;
		for(int i = 0;i<N;i++){
          for(int j = 0;j<N;j++){
            if(i==j) continue;
            //System.out.println(j);
            if(A[i] % A[j] == 0) {
              ans += 1;
              break;
         	 }
          }
        }
        
        System.out.println(N - ans);
    }
}