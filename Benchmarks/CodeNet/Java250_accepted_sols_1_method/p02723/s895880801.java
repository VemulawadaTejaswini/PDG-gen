import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s =sc.next();
    String x[]=s.split("",0);
    if(x[2].equals(x[3])){
      if(x[4].equals(x[5])){System.out.println("Yes");}
      else{System.out.println("No");}}
    else{System.out.println("No");}
  }
}
