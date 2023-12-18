import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(system.in);
    int N =sc.nextInt();
    int X =sc.nextInt();
    int T =sc.nextInt();
    if(X==1){System.out.println(N*T);}
    else{
      int w =(N+1)/X;
      System.out.println(w*T);}
  }
}