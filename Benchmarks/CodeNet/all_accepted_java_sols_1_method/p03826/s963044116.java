import java.util.*;


public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int ansA = A * B;
    int ansB = C * D;
    if(ansA <= ansB){
      System.out.println(ansB);
    }else{
      System.out.println(ansA);
    }
  }
}