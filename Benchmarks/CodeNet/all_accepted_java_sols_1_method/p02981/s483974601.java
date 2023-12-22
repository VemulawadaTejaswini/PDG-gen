import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int T = N*A;
    if (T<=B){
      System.out.println(T);
    } else {
      System.out.println(B);
    }      
  }
}