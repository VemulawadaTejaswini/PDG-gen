import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    double N = sc.nextDouble();
    double a;
    if(N % 2 == 0){
      a = 0.5;
    } else {
      a = ((N - 1)/2 + 1)/N;
    }
    
    System.out.println(a);
  }
}
  