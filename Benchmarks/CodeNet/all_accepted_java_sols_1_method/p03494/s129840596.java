import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long [N];
    
    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
    }
    int count = 0;
    boolean next = true;
    while (next) {
      for (int i = 0; i < A.length; i++) {
        if (A[i] % 2 == 0) {
          A[i] = A[i] / 2;
        } else {
          next = false;
        }
      }
      if (next) {
        count++;
      }
    }
    System.out.printf("%d\n", count);
  }
}