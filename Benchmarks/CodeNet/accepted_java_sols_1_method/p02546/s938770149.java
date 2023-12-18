import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String s[] =S.split("",0);
    int N =S.length();
    if(s[N-1].equals("s")){System.out.println(S+"es");}
    else{System.out.println(S+"s");}
  }
}