import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    for(int i = 0; i < K; i++){
      if(i%2==0){
        if(A%2 == 1){
          A--;
        }
        A /= 2;
        B += A;
      }else{
        if(B%2 == 1){
          B--;
        }
        B /= 2;
        A += B;
      }
    }
    
    System.out.println(A+" "+B);
  }
}