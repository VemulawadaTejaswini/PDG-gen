import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String T =sc.next();
    int s =S.length();
    String t =T.substring(0,s-1);
    if(t.equals(S)){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}