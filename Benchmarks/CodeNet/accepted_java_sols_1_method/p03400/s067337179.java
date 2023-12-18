import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int A[] = new int[N+1];
    A[0] = 0;
    for(int i=1;i<=N;i++){
      A[i] = sc.nextInt();
    }
    int count=0;
    for(int i=1;i<=N;i++){
      int j=0;
      while(true){
        if((j*A[i])+1 <= D){
          j++;
          count++;
        }else{
          break;
        }
      }
    }
    System.out.println(count + X);
  }
}
