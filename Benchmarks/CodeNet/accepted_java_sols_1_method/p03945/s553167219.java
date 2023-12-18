import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String a[]=sc.next().split("",0);
  int count=0;
  String b=a[0];
  for(int i=1;i<a.length;i++){
    if(!b.equals(a[i])){b=a[i];count++;}
  }
  System.out.println(count);
}
}