import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String po=sc.next();
  int length=po.length();
  String p=po.replace("1","");
  po=po.replace("0","");
  System.out.println(Math.min(p.length(),po.length())*2);
}
}
