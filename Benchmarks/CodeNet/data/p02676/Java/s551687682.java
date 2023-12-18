import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int K =sc.nextInt();
    String S =sc.next();
    int s =S.length();
    if(s<=K){System.out.println(S);}
    else{
      String T =S.substring(K);
      System.out.println(T+"...");}
  }
}