import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int dg = 0;
    while(N!=0){
      N=N/K;
      dg=dg+1;
    }
    System.out.println(dg);
  }
  

  
}