import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long a=sc.nextLong();
  long aa=a/1000;
  double d=sc.nextDouble();
  long aaa=aa*(d*1000);
  int aaaa=(int)(a%1000)*d;
  System.out.println(aaa+aaaa);
}
}
