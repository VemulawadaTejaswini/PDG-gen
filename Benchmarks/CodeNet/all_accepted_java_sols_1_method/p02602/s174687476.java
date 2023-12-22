import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int K = sc.nextInt();
      	Integer a[] = new Integer[N+1];
        for (int i=1; i<=N; i++) {
            a[i] = sc.nextInt();
        }  
    
      /**
      	for (int i=K+1; i<=N; i++) {
          	ans[i] = 1;
          for(int j=i-K+1; j<=i; j++){
            ans[i] = a[j] * ans[i];
            }
          }
        }  **/
      	for (int i=K+1; i<=N; i++) {
          if (a[i] > a[i-K])
            System.out.println("Yes");
      	  else
            System.out.println("No"); 
        } 
    }
}