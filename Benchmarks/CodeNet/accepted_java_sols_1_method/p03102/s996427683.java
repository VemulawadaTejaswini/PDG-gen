import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int B[] = new int[M];
    for(int j=0; j<M; j++){
      B[j] = sc.nextInt();
    }
    int r=0;
    for(int i=0; i<N; i++){
      int s=C;
      for(int b: B){
        int a = sc.nextInt();
        s += a*b;
      }
      if(s>0){
        r++;
      }
    }
    System.out.println(r);
  }
}