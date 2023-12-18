import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    final int K=sc.nextInt();
    final int X=sc.nextInt();
    final int Y=sc.nextInt();
    int answer=0;
    if(N<=K){
      answer=N*X;
    }else{
      answer=K*X+Y*(N-K);
    }
    System.out.println(answer);
  }
}