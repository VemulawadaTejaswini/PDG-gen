import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();


    int P = A + B;
    int Q = P % 2;
    if(Q == 1 ) {
      System.out.println("IMPOSSIBLE");
    }else{
      System.out.println(P / 2);
    }
  }
}
