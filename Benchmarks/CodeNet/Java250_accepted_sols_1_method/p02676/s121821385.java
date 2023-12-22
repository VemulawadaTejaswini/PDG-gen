import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  String po=sc.next();
  if(po.length()>k){
  System.out.println(po.substring(0,k)+"...");
  }else
  System.out.println(po);
}
}
