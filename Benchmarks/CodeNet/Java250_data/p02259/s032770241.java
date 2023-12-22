import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    boolean flag = true;
    int ans = 0;
    while(flag){
      flag = false;
      for(int j=N-1;j>=1;j--){
        if(A[j]<A[j-1]){
          int tmp = A[j];
          A[j] = A[j-1];
          A[j-1] = tmp;
          flag = true;
          ans++;
        }
      }
    }
    for(int i=0;i<N;i++){
      if(i>0){
        System.out.print(" ");
      }
      System.out.print(A[i]);
    }
    System.out.print("\n");
    System.out.println(ans);
  }

}

