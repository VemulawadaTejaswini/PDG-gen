import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K=sc.nextInt();
    int x =N;int y=1;
    while(x>=K){
      x=x/K;y=y+1;}
    System.out.println(y);
  }
}