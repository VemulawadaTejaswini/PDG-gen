import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int s = Math.max(A,C);
    int e = Math.min(B,D);
    System.out.println(Math.max(0,e-s));
  }
  

  
}