import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int L =-1+sc.nextInt();
    int R =sc.nextInt();
    int d =sc.nextInt();
    int M =L/d;
    int N =R/d;
    System.out.println(N-M);
  }
}