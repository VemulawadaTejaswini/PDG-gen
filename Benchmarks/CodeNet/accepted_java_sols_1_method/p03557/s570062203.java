import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    String[] sA = sc.nextLine().split(" ");
    String[] sB = sc.nextLine().split(" ");
    String[] sC = sc.nextLine().split(" ");
    for(int i = 0; i < N; i++){
      A[i] = Integer.parseInt(sA[i]);
      B[i] = Integer.parseInt(sB[i]);
      C[i] = Integer.parseInt(sC[i]);
    }
    Arrays.sort(A);
    Arrays.sort(B);
    Arrays.sort(C);
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      int BP = B[i];
	  int lb = 0;
	  int ub = N-1;
      long a = 0;
      if(A[0] >= BP){
        a = 0;
      }else if(A[N-1] < BP){
        a = N;
      }else{
        while(lb != ub-1){
          int cen = (lb+ub)/2;
          if(A[cen] < BP){
            lb = cen;
          }else{
            ub = cen;
          }
        }
        a = ub;
      }
      lb = 0;
	  ub = N-1;
      long c = 0;
      if(C[0] > BP){
        c = N;
      }else if(C[N-1] <= BP){
        c = 0;
      }else{
        while(lb != ub-1){
          int cen = (lb+ub)/2;
          if(C[cen] <= BP){
            lb = cen;
          }else{
            ub = cen;
          }
        }
        c = N-ub;
      }
      ans += a*c;
    }
    System.out.println(ans);
  }
}