import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

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
