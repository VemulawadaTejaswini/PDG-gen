import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String a =sc.next();
    int A =a.length();
    String D [] =a.split("",0);
    String b =sc.next();
    String E[] =b.split("",0);
    int B =b.length();
    String c =sc.next();
    String F[] =c.split("",0);
    if((D[A-1].equals(E[0]))&&(E[B-1].equals(F[0]))){System.out.println("YES");}
    else{System.out.println("NO");}
  }
}
