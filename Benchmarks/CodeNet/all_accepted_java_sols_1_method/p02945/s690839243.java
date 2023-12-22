import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x,y,z,s;
    x=a+b;
    y=a-b;
    z=a*b;
    if(x>y){
      s=x;
    }else{
      s=y;
    }
    if(s>z){
      System.out.println(s);
    }else{
      System.out.println(z);
    }
  }
}
