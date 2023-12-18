import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	Long A[] = new Long[N+1];
        for (int i=0; i<=N; i++) {
            A[i] = sc.nextLong();
        }
      	int ans = 0;
      	int d = 1;
      	for(int j=1; j<N; j++){
        if(d <= 0) break;
          if(A[j] == 0){
            if(d * 2 <= A[N]){
              ans = ans + d*2;
              d = d*2;
            }
            else{
              ans = ans + A[N];
              d = A[N];
            }
          }
          else {
            if(d * 2 - A[j] <= A[N]){
              ans = ans + d*2 - A[j];
              d = d*2 - A[j];
            }
            else{
              if(A[j] == A[N-1]){
                ans = ans + A[N];
             	d = A[N];
              }
              else{
              ans = ans + A[N] + A[j+1];
              d = A[N]; }
            }
          }
        System.out.println(ans);  
        System.out.println("d="+d);
        }
      	int sum = 0;;
        for( int i=0; i<A.length; i++ ) {
          sum += A[i];
        }
      	System.out.println(sum);
        ans = ans + sum + 1;
      	if(d>=2){
        System.out.println(ans); }
      	else{
          System.out.println("-1");
   		 }
    }
}