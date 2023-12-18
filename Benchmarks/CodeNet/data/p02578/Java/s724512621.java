import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i=0; i<N; i++){
      A[i] = sc.nextInt();
      //System.out.print(A[i] + " ");
    }
    //System.out.println();
    int ans = 0;
    for (int i=0; i<N; i++){
      if (i==N-1){
        break;
      }
      //System.out.print(A[i] + "[00]");
      //System.out.print(A[i] + "<");
      if (A[i]>A[i+1]){
        int sum = 0;
        for (int j=i+1; j<N; j++){
          if (j==N-1){
            if (A[i]<A[j]) {
              //System.out.print(A[j] + "<");
              ans += sum;
              i = j-1;
              break;
            }
            //System.out.print(A[j] + (A[i]-A[j]) + "*");
            sum += A[i]-A[j];
            ans += sum;
            i = j-1;
            break;
          }
          if (A[i]<A[j]){
            ans += sum;
            i = j-1;
            break;
          } else {
            //System.out.print(A[j] + "[" + (A[i]-A[j]) + "]");
            //System.out.print(A[j] + (A[i]-A[j]) + "*");
            sum += A[i]-A[j];
          }
        }
      }
    }
    //System.out.println(); 
    System.out.println(ans);  
  }
}