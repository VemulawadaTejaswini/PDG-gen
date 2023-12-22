import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long max1 = 0;
    long max2 = 0;
    long A[] = new long[N];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextLong();
    }
    for (int i=0; i<N; i++) {
      if(max1 <= A[i]){
        max2 = max1;
        max1 = A[i];
      } else if(max2 <= A[i]){
        max2 = A[i];
      }
    }
    for (int i=0; i<N; i++) {
      if(max1 != A[i]){
        System.out.println(max1);
      } else {
        System.out.println(max2);
      }
    }
  }
}