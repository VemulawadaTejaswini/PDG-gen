import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    int P = A * B;
    int Q = C * D; 
    if(P < Q ) {
      System.out.println(Q);
    }else{
      System.out.println(P);
    }
  }
}
