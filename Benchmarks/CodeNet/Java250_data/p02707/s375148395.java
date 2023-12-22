
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A[] = new int[N+1];//上司マップ
    int B[] = new int[N+1];//部下の数配列
    A[0]=0;
    A[1]=0;
    B[0]=0;
    for(int i=2;i<=N;i++){
      A[i]=sc.nextInt();
      B[A[i]]++;
    }
    for(int i=1;i<=N;i++){
      System.out.println(B[i]);
    }



  }
}
 