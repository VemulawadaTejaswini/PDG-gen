import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int A = K;
    int R = 1;

    
    while((N - A) >= 0){
      A =  A * K;
      R++;
    }   

    System.out.println(R);
  }
}

