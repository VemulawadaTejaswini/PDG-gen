import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s =sc.next();
    String S[] =s.split("",0);
    Arrays.sort(S);
    if((S[0].equals(S[1])&&!(S[1].equals(S[2])))&&S[2].equals(S[3])){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}