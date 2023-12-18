import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();

    if((B - A) / 2.0 >= K){
      for(int i = 0; i < K; i++){
        System.out.println(A + i);
      }
      for(int i = 0; i < K; i++){
        System.out.println(B - K + i + 1);
      }
    }else{
      for(int i = 0; i < B - A + 1; i++){
        System.out.println(A + i);
      }
    }
  }
}
