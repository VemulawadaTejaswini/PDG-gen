import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  double x=c*30;
  double y=d*6;
  x+=d*0.5;
  x=(x-y)*Math.PI/180;
  System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(x)));
}
}
