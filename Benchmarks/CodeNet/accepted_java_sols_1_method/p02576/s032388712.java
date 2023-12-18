import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int X =sc.nextInt();
    int T =sc.nextInt();
    int w =N/X;
    if(N%X==0){
      System.out.println(w*T);}
    else{System.out.println((w+1)*T);}
  }
}