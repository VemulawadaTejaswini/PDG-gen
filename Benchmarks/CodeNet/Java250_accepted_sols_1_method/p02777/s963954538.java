import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String Red=sc.next();
    String Blue=sc.next();
    int N=sc.nextInt();
    int M=sc.nextInt();
    String Ball=sc.next();
    
    if(Ball.equals(Red)) System.out.print((N-1)+" "+M);
    if(Ball.equals(Blue)) System.out.print(N+" "+(M-1));
  }
}
