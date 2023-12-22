import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int N = S.length();
    int A[] = new int[N];
    int Len = 0;
    int RL = 0;
    
    for (int i = 0; i < N; i++){
      if(S.substring(i,i+1).equals("R")){
        Len++;
        RL++;
      } else {
        if(i == N-1 || S.substring(i+1,i+2).equals("R")){
          Len++;
          if(Len%2 == 0){
            A[i-Len+RL]   = Len/2;
            A[i-Len+RL+1] = Len/2;
          } else {
            if(RL%2 == 0){
              A[i-Len+RL]   = Len/2;
              A[i-Len+RL+1]   = Len/2+1;
            } else {
              A[i-Len+RL]   = Len/2+1;
              A[i-Len+RL+1]   = Len/2;
            }
          }
          Len = 0;
          RL = 0;
        } else {
          Len++;
        }
      }
    }
    for (int i = 0; i < N; i++){
      System.out.print(A[i] + " ");
    }
  }
}